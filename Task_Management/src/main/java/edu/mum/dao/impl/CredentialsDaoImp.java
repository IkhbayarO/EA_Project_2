package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CredentialsDao;

import edu.mum.domain.Credentials;
@Repository
public class CredentialsDaoImp extends GenericDaoImp<Credentials> implements CredentialsDao {
	public CredentialsDaoImp() {
		super.setDaoType(Credentials.class);
	}
	
	public Credentials findByUserName(String userName) {

		Query query = entityManager.createQuery("select m from CREDENTIALS m  where m.username =:userName");
		return (Credentials) query.setParameter("userName", userName).getSingleResult();

	}
	
	public List<Credentials> getAllCredentials() {

		return this.findAll();

	}

}
