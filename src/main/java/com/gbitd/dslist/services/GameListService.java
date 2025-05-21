package com.gbitd.dslist.services;

import com.gbitd.dslist.dto.GameDTO;
import com.gbitd.dslist.dto.GameListDTO;
import com.gbitd.dslist.dto.GameMinDTO;
import com.gbitd.dslist.entities.Game;
import com.gbitd.dslist.entities.GameList;
import com.gbitd.dslist.repositories.GameListRepository;
import com.gbitd.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;

    }
}
