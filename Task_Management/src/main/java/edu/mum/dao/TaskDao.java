package edu.mum.dao;

import java.util.List;


import edu.mum.domain.Task;

public interface TaskDao extends GenericDao<Task>{
	public Task findOne(Long id);

	public List<Task> findAll();

	public void update(Task task);

	public void delete(Task task);
}
