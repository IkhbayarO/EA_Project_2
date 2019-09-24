package edu.mum.dao;

import java.util.List;



public interface Authority extends GenericDao<Authority> {
	public Authority findOne(Long id);

	public List<Authority> findAll();


	public void delete(Long id);

}
