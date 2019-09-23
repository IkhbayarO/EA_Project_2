package edu.mum.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
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

	
	
}
