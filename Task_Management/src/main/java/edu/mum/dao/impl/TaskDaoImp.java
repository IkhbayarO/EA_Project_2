package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.TaskDao;
import edu.mum.domain.Task;

@Repository
public class TaskDaoImp extends GenericDaoImp<Task> implements TaskDao{
	public TaskDaoImp() {
		super.setDaoType(Task.class);
	}
	
	public Task findByTaskName(String taskName) {

		Query query = entityManager.createQuery("select t from TASK t  where t.taskName =:taskName");
		return (Task) query.setParameter("taskName", taskName).getSingleResult();

	}
	
	
	public List<Task> getAllCredentials() {

		return this.findAll();

	}

}
