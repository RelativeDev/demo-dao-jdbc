package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	
	void update(Department obj);
	
	void delete(Department obj);
	
	Department finById(Integer id);
	
	List<Department> findAll();

}
