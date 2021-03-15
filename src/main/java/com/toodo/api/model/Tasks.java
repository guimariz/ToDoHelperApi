package com.toodo.api.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

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
	@Size(min=1, max = 10)
	@Column(name="status")
	private String status;
	
	@NotNull
	@Column(name="open")
	private Boolean open;
	
	@NotNull
	@Column(name="data_start")
	private LocalTime taskStart;
	
	@Column(name="data_final")
	private LocalTime taskFinal;
	
	@NotNull
	@Column(name="tempo_task")
	private Long taskTimer;
	
	@NotNull
	@Column(name="tempo_descanso")
	private Long restTimer;
	
	@NotNull
	@Column(name="is_ready")
	private Boolean isReady;
	
	public Boolean getIsReady() {
		return isReady;
	}

	public void setIsReady(Boolean isReady) {
		this.isReady = isReady;
	}

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
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public LocalTime getTaskStart() {
		return taskStart;
	}

	public void setTaskStart(LocalTime taskStart) {
		this.taskStart = taskStart;
	}

	public LocalTime getTaskFinal() {
		return taskFinal;
	}

	public void setTaskFinal(LocalTime taskFinal) {
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
