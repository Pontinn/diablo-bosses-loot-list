package dev.pontin.DiabloBossLootList.Classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private ClassNames classNames;
    
    @Column(name = "img_url")
    private String imgUrl;

    @Transient
    public String getClassNames() {
        return classNames != null ? classNames.getName() : null;
    }


}
