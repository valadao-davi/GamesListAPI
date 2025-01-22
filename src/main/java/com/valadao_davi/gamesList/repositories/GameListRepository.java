package com.valadao_davi.gamesList.repositories;

import com.valadao_davi.gamesList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
