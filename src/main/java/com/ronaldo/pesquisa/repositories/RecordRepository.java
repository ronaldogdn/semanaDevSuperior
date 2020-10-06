package com.ronaldo.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.pesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
