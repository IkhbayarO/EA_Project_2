package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Project;


public interface ProjectDao extends GenericDao<Project> {
	
	public Project findOne(Long id);

	public List<Project> findAll();

	public void update(Project project);

	public void delete(Project project);

}
