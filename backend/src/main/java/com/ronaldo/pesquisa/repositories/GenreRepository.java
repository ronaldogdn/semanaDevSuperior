package com.ronaldo.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.pesquisa.entities.Game;
import com.ronaldo.pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
