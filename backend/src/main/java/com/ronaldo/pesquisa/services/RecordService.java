package com.ronaldo.pesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldo.pesquisa.dto.RecordDTO;
import com.ronaldo.pesquisa.dto.RecordInsertDTO;
import com.ronaldo.pesquisa.entities.Game;
import com.ronaldo.pesquisa.entities.Record;
import com.ronaldo.pesquisa.repositories.GameRepository;
import com.ronaldo.pesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}

	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoment(Instant minDate, Instant maxDate, PageRequest pageable) {
		
		return repository.findByMoments(minDate,maxDate,pageable).map(x -> new RecordDTO(x));
	}
}
