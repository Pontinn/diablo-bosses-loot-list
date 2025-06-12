package dev.pontin.DiabloBossLootList.Bosses;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "tb_bosses")
public class BossModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "location")
    private String location;

    @Enumerated(EnumType.STRING)
    private BossesMaterials bossMaterial;

    @Transient
    public String getMaterialName() {
        return bossMaterial != null ? bossMaterial.getName() : null;
    }

    @Transient
    public int getMaterialQuantity() {
        return bossMaterial != null ? bossMaterial.getQuantity() : 0;
    }


}
