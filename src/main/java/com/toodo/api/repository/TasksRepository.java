package com.toodo.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toodo.api.model.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long> {
	List<Tasks> findByStatus(String status);
}
