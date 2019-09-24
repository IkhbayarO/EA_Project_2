package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Credentials;


public interface CredentialsDao extends GenericDao<Credentials> {

	public Credentials findOne(Long id);

	public List<Credentials> findAll();

	public void update(Credentials credential);

	public void delete(Long id);
	
	public Credentials findByUserName(String userName);

}
