package com.valadao_davi.gamesList.repositories;

import com.valadao_davi.gamesList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
