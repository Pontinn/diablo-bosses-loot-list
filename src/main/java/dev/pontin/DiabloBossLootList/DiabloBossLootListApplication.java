package dev.pontin.DiabloBossLootList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.pontin.DiabloBossLootList.Bosses.BossModel;
import dev.pontin.DiabloBossLootList.Bosses.BossRepository;
import dev.pontin.DiabloBossLootList.Classes.ClassModel;
import dev.pontin.DiabloBossLootList.Classes.ClassNames;
import dev.pontin.DiabloBossLootList.Classes.ClassRepository;
import dev.pontin.DiabloBossLootList.DTO.UniqueSeedDTO;
import dev.pontin.DiabloBossLootList.Uniques.ItemRarity;
import dev.pontin.DiabloBossLootList.Uniques.ItemType;
import dev.pontin.DiabloBossLootList.Uniques.UniqueModel;
import dev.pontin.DiabloBossLootList.Uniques.UniqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class DiabloBossLootListApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiabloBossLootListApplication.class, args);
    }

    @Bean
    CommandLineRunner seedUniques(
            ObjectMapper mapper, //Used for read JSON files to Java objects.
            BossRepository bossRepository, //Search for bosses in db.
            ClassRepository classRepository, //Search for classes in db.
            UniqueRepository uniqueRepository //To save unique items.
    ) {
        return args -> {
            //Read JSON file
            InputStream is = new ClassPathResource("data/uniques.json").getInputStream();

            //Convert JSON in Java object
            List<UniqueSeedDTO> items = mapper.readValue(is, new TypeReference<>() {
            });

            for (UniqueSeedDTO dto : items) {
                UniqueModel item = new UniqueModel();
                item.setName(dto.getName());
                item.setImgUrl(dto.getImgUrl());
                item.setItemType(ItemType.valueOf(dto.getItemType().toUpperCase()));
                item.setItemRarity(ItemRarity.valueOf(dto.getItemRarity().toUpperCase()));
                item.setItemPropriety1(dto.getItemPropriety1());
                item.setItemPropriety2(dto.getItemPropriety2());
                item.setItemAffix1(dto.getItemAffix1());
                item.setItemAffix2(dto.getItemAffix2());
                item.setItemAffix3(dto.getItemAffix3());
                item.setItemAffix4(dto.getItemAffix4());
                item.setItemAspect(dto.getItemAspect());

                Set<BossModel> bosses = dto.getBosses() == null
                        ? Set.of()
                        : dto.getBosses().stream()
                        .map(name -> bossRepository.findByName(name).orElseThrow())
                        .collect(Collectors.toSet());
                item.setBosses(bosses);

                Set<ClassModel> classes = dto.getClasses() == null
                        ? Set.of()
                        : dto.getClasses().stream()
                        .map(name -> classRepository.findByClassNames(ClassNames.valueOf(name.toUpperCase())))
                        .collect(Collectors.toSet());
                item.setClasses(classes);


                uniqueRepository.save(item);
            }
        };
    }

}
