package edu.mum.dao;

import java.util.List;


import edu.mum.domain.Team;

public interface TeamDao extends GenericDao<Team> {
	
	public Team findOne(Long id);

	public List<Team> findAll();

	public void update(Team team);

	public void delete(Long id);
	
	public Team findByUserName(String teamName);
}
