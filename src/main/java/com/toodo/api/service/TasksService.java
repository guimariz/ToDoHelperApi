package com.toodo.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.toodo.api.model.Tasks;
import com.toodo.api.repository.TasksRepository;

@Service
public class TasksService {

	@Autowired
	private TasksRepository tasksRepository;
	
	public Tasks buscarTasksPeloID(Long id) {
        Tasks tasksSalva = tasksRepository.findById(id).get();
        if(tasksSalva == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return tasksSalva;
    }
	
	public Tasks atualizar(Long id, Tasks tasks) {
		Tasks tasksSalva = buscarTasksPeloID(id);
        BeanUtils.copyProperties(tasks, tasksSalva, "id");
        return tasksRepository.save(tasksSalva);
    }
}
