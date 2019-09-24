package edu.mum.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	@NotEmpty
	private String title;
	
	
	@Column
	@NotEmpty
	private String description;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	

	
	@OneToMany()
	@JoinColumn(name="project_id", referencedColumnName = "id")
	private List<Task> tasks=new ArrayList<Task>();
	
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private  Team team;

	


	public Project() {
	}




	public Project(String title, String description, Date startDate, Date endDate, List<Task> tasks, Team team) {
		super();
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.tasks = tasks;
		this.team = team;
	}




	public Project(String title, String description, Date startDate, Date endDate, List<Task> tasks) {
		super();
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.tasks = tasks;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Date getStartDate() {
		return startDate;
	}




	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}




	public Date getEndDate() {
		return endDate;
	}




	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}




	public List<Task> getTasks() {
		return tasks;
	}




	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}




	public Team getTeam() {
		return team;
	}




	public void setTeam(Team team) {
		this.team = team;
	}
	
	
}
