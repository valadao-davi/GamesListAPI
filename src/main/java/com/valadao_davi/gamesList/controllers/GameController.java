package com.valadao_davi.gamesList.controllers;

import com.valadao_davi.gamesList.dto.GameMinDTO;
import com.valadao_davi.gamesList.entities.Game;
import com.valadao_davi.gamesList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Game findById(@PathVariable Long id){
        return  gameService.findOne(id);
    }

}
