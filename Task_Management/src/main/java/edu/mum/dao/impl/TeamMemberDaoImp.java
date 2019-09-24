package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.TeamMemberDao;
import edu.mum.domain.Task;
import edu.mum.domain.TeamMember;

@Repository
public class TeamMemberDaoImp extends GenericDaoImp<TeamMember> implements TeamMemberDao{
	
	public TeamMemberDaoImp() {
		super.setDaoType(TeamMember.class);
	}
	
	public TeamMember findTeamMemberByEmail(String email) {

		Query query = entityManager.createQuery("select m from TEAMMEMBER m  where m.email =:email");
		return (TeamMember) query.setParameter("email", email).getSingleResult();

	}
	
}
