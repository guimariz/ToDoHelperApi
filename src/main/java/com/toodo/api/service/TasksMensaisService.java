package com.toodo.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toodo.api.model.Tasks;
import com.toodo.api.model.TasksMensais;
import com.toodo.api.repository.TasksMensaisRepository;

@Service
public class TasksMensaisService {

	@Autowired
	private TasksMensaisRepository tasksMensaisRepository;
	
	@Autowired
	private TasksService tasksService;

	/*
	public TasksMensais buscarTasksMensaisPeloID(Long id) {
        TasksMensais tasksMensaisSalva = tasksMensaisRepository.findById(id).get();
        if(tasksMensaisSalva == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return tasksMensaisSalva;
    }*/

	public TasksMensais buscarTasksMensaisPeloID(Long id, TasksMensais tasksMensais) {
        Tasks tasks = tasksService.buscarTasksPeloID(tasksMensais.getIdTasks().getId());
        
        return tasksMensaisRepository.save(tasksMensais);
    }
	
	public TasksMensais atualizar(Long id, TasksMensais tasksMensais) {
		TasksMensais tasksMensaisSalva = buscarTasksMensaisPeloID(id, tasksMensais);
        BeanUtils.copyProperties(tasksMensais, tasksMensaisSalva, "id");
        return tasksMensaisRepository.save(tasksMensaisSalva);
    }
}
