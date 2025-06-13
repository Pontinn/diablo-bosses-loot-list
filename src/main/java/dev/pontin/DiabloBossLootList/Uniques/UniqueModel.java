package dev.pontin.DiabloBossLootList.Uniques;

import dev.pontin.DiabloBossLootList.Bosses.BossModel;
import dev.pontin.DiabloBossLootList.Classes.ClassModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "tb_unique")
public class UniqueModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "unique_name")
    private String name;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "type")
    private ItemType itemType;

    @Column(name = "rarity")
    private ItemRarity itemRarity;

    @Column(name = "propriety_1")
    private String itemPropriety1;

    @Column(name = "propriety_2")
    private String itemPropriety2;

    @Column(name = "affix_1")
    private String itemAffix1;

    @Column(name = "affix_2")
    private String itemAffix2;

    @Column(name = "affix_3")
    private String itemAffix3;

    @Column(name = "affix_4")
    private String itemAffix4;

    @Column(name = "aspect")
    private String itemAspect;

    @ManyToMany
    @JoinTable(
            name = "unique_class",
            joinColumns = @JoinColumn(name = "unique_id"),
            inverseJoinColumns = @JoinColumn(name = "class_id")

    )
    private Set<ClassModel> classes = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "unique_boss",
            joinColumns = @JoinColumn(name = "unique_id"),
            inverseJoinColumns = @JoinColumn(name = "boss_id")
    )
    private Set<BossModel> bosses = new HashSet<>();

    @Transient
    public String getItemType() {
        return itemType != null ? itemType.getName() : null;
    }
}
