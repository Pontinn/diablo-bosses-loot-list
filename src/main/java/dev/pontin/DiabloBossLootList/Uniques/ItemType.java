package dev.pontin.DiabloBossLootList.Uniques;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public enum ItemType {
    HELM("Helm"),
    CHEST_ARMOR("Chest Armor"),
    GLOVES("Gloves"),
    PANTS("Pants"),
    BOOTS("Boots"),
    AMULET("Amulet"),
    RING("Ring"),
    STAFF("Staff"),
    QUARTERSTAFF("Quarterstaff"),
    WAND("Wand"),
    FOCUS("Focus"),
    ONE_HANDED_SWORD("One Handed Sword"),
    TWO_HANDED_SWORD("Two Handed Sword"),
    DAGGER("Dagger"),
    ONE_HANDED_MACE("One Handed Mace"),
    TWO_HANDED_MACE("Two Handed Mace"),
    GLAIVE("Glaive"),
    BOW("Bow"),
    ONE_HANDED_SCYTHE("One Handed Scythe"),
    TWO_HANDED_SCYTHE("Two Handed Scythe"),
    TOTEM("Totem"),
    ONE_HANDED_AXE("One Handed Axe"),
    TWO_HANDED_AXE("Two Handed Axe"),
    SHIELD("Shield");

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
