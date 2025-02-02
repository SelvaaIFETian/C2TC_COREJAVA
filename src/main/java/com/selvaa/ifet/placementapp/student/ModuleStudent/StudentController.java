package com.selvaa.ifet.placementapp.student.ModuleStudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class StudentController {

	@Autowired
	private StudentService stud;
	@GetMapping("/studentservice")
	public List<Student>list(){
		return stud.listAll();
}
	@PostMapping("/studentservice")
	public void add(@RequestBody Student stud1) {
		stud.save(stud1);
	}
	@GetMapping("studentservice/{id}")
	public ResponseEntity<Student>get(@PathVariable Integer id){
		try {
		Student s=stud.get(id);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
		}
		catch(NoResultException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("studentservice/{id}")
	public void delete(@PathVariable Integer id) {
		stud.delete(id);
	}
	@PutMapping("studentservice/{id}")
	public ResponseEntity<Student>update(@PathVariable Integer id,@RequestBody Student st){
		try {
		Student exist_s=stud.get(id);
		exist_s.setName(st.getName());
		exist_s.setYear(st.getYear());
		exist_s.setRegNo(st.getRegNo());
		exist_s.setDept(st.getDept());
		exist_s.setSSLC_Mark(st.getSSLC_Mark());
		exist_s.setHSC_Mark(st.getHSC_Mark());
		exist_s.setCGPA(st.getCGPA());
		return new ResponseEntity<Student>(exist_s,HttpStatus.OK);
		}
		catch(NoResultException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
}
