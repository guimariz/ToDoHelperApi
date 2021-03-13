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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.toodo.api.model.Tasks;
import com.toodo.api.repository.TasksRepository;

@RestController
@RequestMapping(value="/tasks")
public class TasksResource {
	
	@Autowired
	private TasksRepository tasksRepository;
	
	@GetMapping
	public List<Tasks> listar(){
		return tasksRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Tasks> Criar(@RequestBody Tasks tasks, HttpServletResponse response) {
		Tasks tasksSalva = tasksRepository.save(tasks);
		return ResponseEntity.status(HttpStatus.CREATED).body(tasksSalva);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id) {
		tasksRepository.deleteById(id);
	}

}
