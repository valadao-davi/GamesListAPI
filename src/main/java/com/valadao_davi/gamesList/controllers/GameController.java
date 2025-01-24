package com.valadao_davi.gamesList.controllers;

import com.valadao_davi.gamesList.dto.GameDTO;
import com.valadao_davi.gamesList.dto.GameMinDTO;
import com.valadao_davi.gamesList.entities.Game;
import com.valadao_davi.gamesList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<GameDTO> findById(@PathVariable Long id){
        GameDTO gameDTO = gameService.findById(id);
        return ResponseEntity.ok(gameDTO);
    }


}
