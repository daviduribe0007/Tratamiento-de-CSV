package com.example.demo.controller;

import com.example.demo.CsvUtilFile;
import com.example.demo.model.Player;
import com.example.demo.repository.PlayerReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
    public class PlayerController {

        @Autowired
        private PlayerReactiveRepository repository;

       @GetMapping("/list-players")
       public String listPlayers(Model model){
           List<Player> flux = CsvUtilFile.getPlayers();
           model.addAttribute("players", flux);
           return "players";
       }
}
