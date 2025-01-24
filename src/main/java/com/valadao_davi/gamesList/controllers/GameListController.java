package com.valadao_davi.gamesList.controllers;
import com.valadao_davi.gamesList.dto.GameListDTO;
import com.valadao_davi.gamesList.dto.GameMinDTO;
import com.valadao_davi.gamesList.dto.ReplacementDTO;
import com.valadao_davi.gamesList.services.GameListService;
import com.valadao_davi.gamesList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping (value = "/{listId}/games")
    public List<GameMinDTO> findById(@PathVariable Long listId){
        return gameService.findByList(listId);
    }

    @PostMapping (value = "/{listId}/replacement")
    public void listReplacement(@PathVariable Long listId, @RequestBody ReplacementDTO replacementDTO){
        gameListService.move(listId, replacementDTO.getSourceIndex(), replacementDTO.getDestinationIndex());
    }

}
