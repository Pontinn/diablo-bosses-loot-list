package dev.pontin.DiabloBossLootList.Bosses;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BossRepository extends JpaRepository<BossModel, Long> {

    Optional<BossModel> findByName(String nome);
}
