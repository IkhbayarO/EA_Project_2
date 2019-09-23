package edu.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Roles {
	@Id
	private String name;
	
	@ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
	private List<User> users=new ArrayList<User>();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public Roles() {
	}

	public Roles(String name) {
		this.name = name;
	}

	public Roles(String name, List<User> users) {
		super();
		this.name = name;
		this.users = users;
	}
	
}
