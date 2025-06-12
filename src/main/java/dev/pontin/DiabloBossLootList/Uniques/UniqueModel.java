package dev.pontin.DiabloBossLootList.Uniques;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "tb_unique")
public class UniqueModel {

    private Long id;

    private String name;

    private String imgUrl;
    
}
