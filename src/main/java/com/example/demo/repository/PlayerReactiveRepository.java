package com.example.demo.repository;

import com.example.demo.model.Player;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerReactiveRepository extends ReactiveCrudRepository<Player, Integer> {
}
