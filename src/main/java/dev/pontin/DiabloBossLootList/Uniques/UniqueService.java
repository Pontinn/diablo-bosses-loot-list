package dev.pontin.DiabloBossLootList.Uniques;

import org.springframework.stereotype.Service;

@Service
public class UniqueService {

    private UniqueRepository uniqueRepository;

    public UniqueService(UniqueRepository uniqueRepository) {
        this.uniqueRepository = uniqueRepository;
    }
}
