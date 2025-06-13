package dev.pontin.DiabloBossLootList.Bosses;

import dev.pontin.DiabloBossLootList.Uniques.UniqueModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_bosses")
public class BossModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "location")
    private String location;

    @Enumerated(EnumType.STRING)
    private BossesMaterials bossMaterial;

    @ManyToMany(mappedBy = "bosses")
    private Set<UniqueModel> uniqueItems = new HashSet<>();

    @Transient
    public String getMaterialName() {
        return bossMaterial != null ? bossMaterial.getName() : null;
    }

    @Transient
    public int getMaterialQuantity() {
        return bossMaterial != null ? bossMaterial.getQuantity() : 0;
    }


}
