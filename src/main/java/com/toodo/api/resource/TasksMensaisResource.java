package com.toodo.api.resource;


import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.toodo.api.model.Tasks;
import com.toodo.api.model.TasksMensais;
import com.toodo.api.repository.TasksMensaisRepository;
import com.toodo.api.service.TasksMensaisService;

@RestController
@RequestMapping(value="/tasksmensais")
public class TasksMensaisResource {
	
	@Autowired
	private TasksMensaisRepository tasksMensaisRepository;
	
	@Autowired
	private TasksMensaisService tasksMensaisService;
	
	@GetMapping
	public List<TasksMensais> listar(){
		return tasksMensaisRepository.findAll();
	}
	
	@GetMapping ("/done")
	public List<TasksMensais> listarDone() {
		return tasksMensaisRepository.findByAllDone(true);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<TasksMensais> Criar(@RequestBody TasksMensais tasksMensais, HttpServletResponse response) {
		TasksMensais tasksMensaisSalva = tasksMensaisRepository.save(tasksMensais);
		return ResponseEntity.status(HttpStatus.CREATED).body(tasksMensaisSalva);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<TasksMensais> atualizar(@PathVariable Long id, @RequestBody TasksMensais tasksMensais){
		TasksMensais tasksMensaisSalva = tasksMensaisService.atualizar(id, tasksMensais);
        return ResponseEntity.ok(tasksMensaisSalva);
    }
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id) {
		tasksMensaisRepository.deleteById(id);
	}

}
