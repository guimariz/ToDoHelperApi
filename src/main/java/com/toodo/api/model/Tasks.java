package com.toodo.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="tasks")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@NotNull
	@Size(min = 1, max = 20)
	@Column(name="nome")
	private String taskName;
	
	
	@NotNull
	@Column(name="data_start")
	private LocalDateTime taskStart;
	
	@Column(name="data_final")
	private LocalDateTime taskFinal;
	
	@NotNull
	@Column(name="tempo_task")
	private Long taskTimer;
	
	@NotNull
	@Column(name="tempo_descanso")
	private Long restTimer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public LocalDateTime getTaskStart() {
		return taskStart;
	}

	public void setTaskStart(LocalDateTime taskStart) {
		this.taskStart = taskStart;
	}

	public LocalDateTime getTaskFinal() {
		return taskFinal;
	}

	public void setTaskFinal(LocalDateTime taskFinal) {
		this.taskFinal = taskFinal;
	}

	public Long getTaskTimer() {
		return taskTimer;
	}

	public void setTaskTimer(Long taskTimer) {
		this.taskTimer = taskTimer;
	}

	public Long getRestTimer() {
		return restTimer;
	}

	public void setRestTimer(Long restTimer) {
		this.restTimer = restTimer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tasks other = (Tasks) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	

}
