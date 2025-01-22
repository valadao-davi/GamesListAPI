package com.valadao_davi.gamesList.services;

import com.valadao_davi.gamesList.dto.GameMinDTO;
import com.valadao_davi.gamesList.entities.Game;
import com.valadao_davi.gamesList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x-> new GameMinDTO(x)).toList();
    }

    
}
