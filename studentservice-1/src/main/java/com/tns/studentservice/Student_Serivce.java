package com.tns.studentservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Student_Serivce 
{
	@Autowired
	private Student_Service_Repository repo;
	
	public List<Student> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Student stud)
	{
		repo.save(stud);
	}
	
	public Student get(Integer s_id)
	{
		return repo.findById(s_id).get();
	}
	public void delete(Integer s_id)
	{
		repo.deleteById(s_id);
	}
	
}

