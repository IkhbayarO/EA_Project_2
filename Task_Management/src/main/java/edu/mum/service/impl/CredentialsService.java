package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.CredentialsDao;
import edu.mum.domain.Credentials;

@Service
@Transactional 
public class CredentialsService implements edu.mum.service.CredentialsService {
	
	@Autowired
	private CredentialsDao credentialsDao;

	@Override
	public void save(Credentials credentials) {
		credentialsDao.save(credentials);
	}

	@Override
	public List<Credentials> findAll() {
		return credentialsDao.findAll();
	}

	@Override
	public void update(Credentials credentials) {
		credentialsDao.update(credentials);
		
	}

	@Override
	public Credentials findOne(Long id) {
		return credentialsDao.findOne(id);
	}

	@Override
	public Credentials findByUserName(String userName) {
		return credentialsDao.findByUserName(userName);
	}


}
