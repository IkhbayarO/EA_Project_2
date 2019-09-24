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
import javax.persistence.Table;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "CREDENTIALS")
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
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "credentials_id")
	List<Authority> authority = new ArrayList<Authority>();

	@Valid
	@OneToOne(mappedBy = "credentials")
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}

	public TeamMember getTeamMember() {
		return teamMember;
	}

	public void setTeamMember(TeamMember teamMember) {
		this.teamMember = teamMember;
	}
	
	
}
