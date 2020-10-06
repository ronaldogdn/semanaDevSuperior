package com.ronaldo.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
