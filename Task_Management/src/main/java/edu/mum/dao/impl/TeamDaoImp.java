package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.TeamDao;
import edu.mum.domain.Team;

@Repository
public class TeamDaoImp extends GenericDaoImp<Team> implements TeamDao{
	public TeamDaoImp() {
		super.setDaoType(Team.class);
	}
	
	public Team findByUserName(String teamName) {

		Query query = entityManager.createQuery("select m from TEAM m  where m.teamName =:teamName");
		return (Team) query.setParameter("teamName", teamName).getSingleResult();

	}
	
	public List<Team> getAllCredentials() {

		return this.findAll();

	}

}
