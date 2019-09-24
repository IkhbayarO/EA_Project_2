package edu.mum.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "TASK")
public class Task {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private String taskName;
	
	@Version
	private int version;
	
	@NotEmpty
	private String status;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date startTime;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date endTime;

	
	
	@NotEmpty
	private String description;
	

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private TeamMember teamMember;

	
	public Task() {

	}


	public Task(String taskName, int version, String status, Date startTime, Date endTime, String description,
			TeamMember teamMember) {
		super();
		this.taskName = taskName;
		this.version = version;
		this.status = status;
		this.startTime = startTime;
		this.endTime = endTime;
		this.description = description;
		this.teamMember = teamMember;
	}


	public Task(String taskName, int version, String status, Date startTime, Date endTime, String description) {
		super();
		this.taskName = taskName;
		this.version = version;
		this.status = status;
		this.startTime = startTime;
		this.endTime = endTime;
		this.description = description;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Date getEndTime() {
		return endTime;
	}


	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public TeamMember getTeamMember() {
		return teamMember;
	}


	public void setTeamMember(TeamMember teamMember) {
		this.teamMember = teamMember;
	}

	
	
}
