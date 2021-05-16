package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/players")
public class PlayercontrollerWithMongo {

    @Autowired
    PlayerReactiveRepository playerReactiveRepository;

    @GetMapping
    Flux<Player> getAll(){
        return playerReactiveRepository.findAll();
    }

}
