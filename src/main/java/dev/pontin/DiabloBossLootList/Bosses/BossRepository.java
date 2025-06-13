package dev.pontin.DiabloBossLootList.Bosses;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BossRepository extends JpaRepository<BossModel, Long> {
}
