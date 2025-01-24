package com.valadao_davi.gamesList.services;

import com.valadao_davi.gamesList.dto.GameListDTO;
import com.valadao_davi.gamesList.entities.GameList;
import com.valadao_davi.gamesList.projections.GameMinProjection;
import com.valadao_davi.gamesList.repositories.GameListRepository;
import com.valadao_davi.gamesList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

   @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(GameListDTO::new).toList();
   }

   @Transactional
   public void move(Long listId, int sourceIndex, int destinationIndex){
       List<GameMinProjection> list = gameRepository.searchByList(listId);

       GameMinProjection gameRemoved = list.remove(sourceIndex);
       list.add(destinationIndex, gameRemoved);
       int min = Math.min(sourceIndex, destinationIndex);
       int max = Math.max(sourceIndex, destinationIndex);
       for(int i = min; i<= max; i++){
           gameListRepository.updateBelongPosition(listId, list.get(i).getId(), i);
       }
   }
}
