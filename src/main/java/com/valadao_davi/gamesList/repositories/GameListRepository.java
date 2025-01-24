package com.valadao_davi.gamesList.repositories;

import com.valadao_davi.gamesList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(nativeQuery = true, value = """
            UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND
            game_id = :gameId
            """)
    void updateBelongPosition(Long listId, Long gameId, Integer newPosition);
}
