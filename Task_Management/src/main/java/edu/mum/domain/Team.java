package edu.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "TEAM")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty
	private String teamName;

	@OneToMany(mappedBy = "team", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<TeamMember> members=new ArrayList<TeamMember>();

	@OneToOne()
	private Project project;

	public Team(String teamName, List<TeamMember> members, Project project) {
		super();
		this.teamName = teamName;
		this.members = members;
		this.project = project;
	}

	public Team(String teamName, List<TeamMember> members) {
		super();
		this.teamName = teamName;
		this.members = members;
	}

	public Team() {
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<TeamMember> getMembers() {
		return members;
	}

	public void setMembers(List<TeamMember> members) {
		this.members = members;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
