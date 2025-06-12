package dev.pontin.DiabloBossLootList.Bosses;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public enum BossesMaterials {
    MALIGNANT_HEART(12, "Malignant Heart"),
    LIVING_STEEL(12, "Living Steel"),
    DISTILLED_FEAR(12, "Distilled Fear"),
    EXQUISITE_BLOOD(12, "Exquisite Blood"),
    JUDICATOR_MASK(12, "Judicator's Mask"),
    SHARDS_OF_AGONY(3, "Shards of Agony"),
    PINCUSHIONED_DOLL(3, "Pincushioned Doll"),
    HATRED_HEARTS(3, "Hatred Hearts"),
    BETRAYER_HUSK(2, "Betrayer's Husk");

    private int quantity;
    private String name;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
