package com.toodo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toodo.api.model.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Long> {

}
