package edu.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Email
	@NotEmpty
	@Column(unique = true)
	private String email;

	@NotEmpty
	@Column
	private String name;
	
	@Column
	@Size(min = 4)
	private String password;


	@Column
	private String rolename;
	
	
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "USER_PROJECT", joinColumns = {
			@JoinColumn(name = "USER_EMAIL", referencedColumnName = "email") }, inverseJoinColumns = {
					@JoinColumn(name = "PROJECT_ID", referencedColumnName = "id") })
//	@JoinColumn(name = "project_id", referencedColumnName ="id")
	private Project project;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ROLES", joinColumns = {
			@JoinColumn(name = "USER_EMAIL", referencedColumnName = "email") }, inverseJoinColumns = {
					@JoinColumn(name = "ROLE_NAME", referencedColumnName = "name") })
	private List<Roles> roles=new ArrayList<Roles>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	

	public Long getId() {
		return id;
	}


	public User(@Email @NotEmpty String email, @NotEmpty String name, @Size(min = 4) String password, Project project,
			String rolename, List<Roles> roles) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.project = project;
		this.rolename = rolename;
		this.roles = roles;
	}

	public User() {
	}

	public User(String email, String name, String password, String rolename) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.rolename = rolename;
	}
	
}
