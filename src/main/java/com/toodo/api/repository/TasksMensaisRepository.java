package com.toodo.api.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toodo.api.model.TasksMensais;

@Repository
public interface TasksMensaisRepository extends JpaRepository<TasksMensais, Long> {
	List<TasksMensais> findByAllDone(Boolean allDone);
	List<TasksMensais> findByIdTasks(Long idTasks);
}
