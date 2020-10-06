//esse pacote também pode ser chamado de "Controllers"
package com.ronaldo.pesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.pesquisa.dto.GameDTO;
import com.ronaldo.pesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResources {

	@Autowired //instancia automatica
	private GameService service;
	
	@GetMapping
	//resposta de requisição
	public ResponseEntity<List<GameDTO>> findAll(){
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
