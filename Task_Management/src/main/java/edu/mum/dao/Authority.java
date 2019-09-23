package edu.mum.dao;

import java.util.List;



public interface Authority extends GenericDao<Authority> {
	public Authority findOne(Long id);

	public List<Authority> findAll();

	public void update(Authority authority);

	public void delete(Authority authority);

}
