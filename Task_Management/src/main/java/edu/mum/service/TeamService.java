package edu.mum.service;



import java.util.List;

import edu.mum.domain.Team;

public interface TeamService {
	public void save(Team team);
	public void  update(Team team);
	public List<Team> findAll();
	public Team findOne(Long id);
	public Team findByUserName(String teamName);
	

}
