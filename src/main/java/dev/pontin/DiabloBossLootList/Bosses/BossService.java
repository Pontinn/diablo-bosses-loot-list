package dev.pontin.DiabloBossLootList.Bosses;

import org.springframework.stereotype.Service;

@Service
public class BossService {

    private BossRepository bossRepository;

    public BossService(BossRepository bossRepository) {
        this.bossRepository = bossRepository;
    }
}
