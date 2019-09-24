package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.TeamDao;
import edu.mum.domain.Team;
import edu.mum.service.TeamService;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamDao teamDao;

	@Override
	public void save(Team team) {
		teamDao.save(team);

	}

	@Override
	public List<Team> findAll() {

		return (List<Team>)teamDao.findAll();
	}

	@Override
	public Team findOne(Long id) {

		return (Team)teamDao.findOne(id);
	}

	@Override
	public void update(Team team) {

		teamDao.update(team);
	}

	@Override
	public Team findByUserName(String teamName) {
		
		return teamDao.findByUserName(teamName);
	}

}
