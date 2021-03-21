package com.toodo.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tasks_mensais")
public class TasksMensais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@NotNull
	@Column(name="all_done")
	private Boolean allDone;
		
	@NotNull
	@Column(name="all_total")
	private Boolean allTotal;
	
	@NotNull
	@OneToOne
	@JoinColumn(name="id_tasks")
	private Tasks idTasks;

	public Tasks getIdTasks() {
		return idTasks;
	}

	public void setIdTasks(Tasks idTasks) {
		this.idTasks = idTasks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getAllDone() {
		return allDone;
	}

	public void setAllDone(Boolean allDone) {
		this.allDone = allDone;
	}

	public Boolean getAllTotal() {
		return allTotal;
	}

	public void setAllTotal(Boolean allTotal) {
		this.allTotal = allTotal;
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
		TasksMensais other = (TasksMensais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
