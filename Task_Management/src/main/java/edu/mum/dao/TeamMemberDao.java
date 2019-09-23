package edu.mum.dao;

import java.util.List;

import edu.mum.domain.TeamMember;

public interface TeamMemberDao extends GenericDao<TeamMember>{
	
	public TeamMember findOne(Long id);
	public List<TeamMember> findAll();
	
	public void update(TeamMember teamMember);
	
	public void delete(TeamMember teamMember);

}
