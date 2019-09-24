package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.ProjectDao;
import edu.mum.domain.Project;


@Repository
public class ProjectDaoImp extends GenericDaoImp<Project> implements ProjectDao {
	public ProjectDaoImp() {
		super.setDaoType(Project.class);
	}
	public Project findByProjectTitle(String title) {

		Query query = entityManager.createQuery("select p from PROJECT p  where p.title =:title");
		return (Project) query.setParameter("title", title).getSingleResult();

	}
	
	public List<Project> getAllCredentials() {

		return this.findAll();

	}
}
