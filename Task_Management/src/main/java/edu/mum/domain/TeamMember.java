package edu.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "TEAM_MEMBER")
public class TeamMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@Email
	private String email;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "teamMember")
	private List<Task> tasks=new ArrayList<Task>();
	
	

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Team team;
	
	@Valid
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="member_id")
	private Credentials credentials;

	public TeamMember() {

	}

	public TeamMember(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public TeamMember(String firstName, String lastName, String email, List<Task> tasks, Team team,
			Credentials credentials) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.tasks = tasks;
		this.team = team;
		this.credentials = credentials;
	}
	
	
	
}
