//esse pacote também pode ser chamado de "Controllers"
package com.ronaldo.pesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.pesquisa.dto.RecordDTO;
import com.ronaldo.pesquisa.dto.RecordInsertDTO;
import com.ronaldo.pesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResources {

	@Autowired //instancia automatica
	private RecordService service;
	
	@PostMapping
	//resposta de requisição
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}
}
 