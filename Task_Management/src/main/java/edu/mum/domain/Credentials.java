package edu.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "CREDENTIALS")
public class Credentials {

	@Id
	@NotEmpty
	@Column(nullable = false, unique = true)
	private String username;
	@Column(nullable = false)
	@NotEmpty
	private String password;
	
	String verifyPassword;
	Boolean enabled;
	
	@Valid
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "credential")
	@JoinColumn(name = "credentials_id")
	List<Authority> authority = new ArrayList<Authority>();

	@Valid
	@OneToOne
	private TeamMember teamMember;

	public Credentials() {
	}

	public Credentials(String username, String password, String verifyPassword, Boolean enabled,
			List<Authority> authority, TeamMember teamMember) {
		super();
		this.username = username;
		this.password = password;
		this.verifyPassword = verifyPassword;
		this.enabled = enabled;
		this.authority = authority;
		this.teamMember = teamMember;
	}

	public Credentials(String username, String password, String verifyPassword, List<Authority> authority) {
		this.username = username;
		this.password = password;
		this.verifyPassword = verifyPassword;
		this.authority = authority;
	}
	
	
}
