package com.selvaa.ifet.placementapp.student.ModuleStudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService 
{
@Autowired
private StudentRepository repo;
	
public List<Student>listAll(){
	return repo.findAll();
}

public void save(Student stud) {
	repo.save(stud);
}

public Student get(Integer id) {
	return repo.findById(id).get();
}
public void delete(Integer id) {
	repo.deleteById(id);
}
public void update(Student stud) {
	repo.save(stud);
}
}
