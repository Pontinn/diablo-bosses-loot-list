package dev.pontin.DiabloBossLootList.Classes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassModel, Long> {

    ClassModel findByClassNames(ClassNames className);
}
