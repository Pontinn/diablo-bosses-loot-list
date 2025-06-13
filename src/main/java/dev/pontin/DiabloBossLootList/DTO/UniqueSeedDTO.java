package dev.pontin.DiabloBossLootList.DTO;

import lombok.Data;

import java.util.List;

@Data
public class UniqueSeedDTO {
    private String name;
    private String imgUrl;
    private String itemType;
    private String itemRarity;
    private String itemPropriety1;
    private String itemPropriety2;
    private String itemAffix1;
    private String itemAffix2;
    private String itemAffix3;
    private String itemAffix4;
    private String itemAspect;

    private List<String> bosses;
    private List<String> classes;
}
