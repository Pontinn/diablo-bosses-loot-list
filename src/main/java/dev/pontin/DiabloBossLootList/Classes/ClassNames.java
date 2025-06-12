package dev.pontin.DiabloBossLootList.Classes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public enum ClassNames {
    SPIRITBORN("Spiritborn"),
    BARBARIAN("Barbarian"),
    SORCERER("Sorcerer"),
    NECROMANCER("Necromancer"),
    DRUID("Druid"),
    ROGUE("Rogue");


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
