package dev.pontin.DiabloBossLootList.Classes;

import dev.pontin.DiabloBossLootList.Uniques.UniqueModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "tb_class")
public class ClassModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "class_name")
    @Enumerated(EnumType.STRING)
    private ClassNames classNames;

    @Column(name = "img_url")
    private String imgUrl;

    @ManyToMany(mappedBy = "classes")
    private Set<UniqueModel> uniqueItems = new HashSet<>();

    @Transient
    public String getClassNames() {
        return classNames != null ? classNames.getName() : null;
    }


}
