package com.devsuperior.dslis.services;


import com.devsuperior.dslis.dto.GameMinDTO;
import com.devsuperior.dslis.entities.Game;
import com.devsuperior.dslis.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
