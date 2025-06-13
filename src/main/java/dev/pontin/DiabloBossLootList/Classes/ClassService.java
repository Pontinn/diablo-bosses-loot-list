package dev.pontin.DiabloBossLootList.Classes;

import org.springframework.stereotype.Service;

@Service
public class ClassService {

    private ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }
}
