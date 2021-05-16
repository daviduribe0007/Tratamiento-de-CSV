package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

   @Controller
    public class PlayerController {

        @Autowired
        private PlayerReactiveRepository repository;

       @GetMapping("/list-players")
       public String listPlayers(Model model){
           Flux<Player> flux = repository.findAll();
           model.addAttribute("players", flux);
           return "players";
       }
}
