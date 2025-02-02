package com.selvaa.ifet.placementapp.student.ModuleStudent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@Column(name="Sid")
	private int id;
	
	
	@Column(name="Sname")
	private String Name;
	@Column(name="Sno")
	private int RegNo;
	@Column(name="Sdept")
	private String Dept;
	@Column(name="Syear")
	private int Year;
	@Column(name="S10th")
	private int SSLC_Mark;
	@Column(name="S12th")
	private int HSC_Mark;
	@Column(name="Cgpa")
	private int CGPA;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, int regNo, String dept, int year, int sSLC_Mark, int hSC_Mark, int cGPA) {
		super();
		this.id = id;
		Name = name;
		RegNo = regNo;
		Dept = dept;
		Year = year;
		SSLC_Mark = sSLC_Mark;
		HSC_Mark = hSC_Mark;
		CGPA = cGPA;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getRegNo() {
		return RegNo;
	}


	public void setRegNo(int regNo) {
		RegNo = regNo;
	}


	public String getDept() {
		return Dept;
	}


	public void setDept(String dept) {
		Dept = dept;
	}


	public int getYear() {
		return Year;
	}


	public void setYear(int year) {
		Year = year;
	}


	public int getSSLC_Mark() {
		return SSLC_Mark;
	}


	public void setSSLC_Mark(int sSLC_Mark) {
		SSLC_Mark = sSLC_Mark;
	}


	public int getHSC_Mark() {
		return HSC_Mark;
	}


	public void setHSC_Mark(int hSC_Mark) {
		HSC_Mark = hSC_Mark;
	}


	public int getCGPA() {
		return CGPA;
	}


	public void setCGPA(int cGPA) {
		CGPA = cGPA;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", RegNo=" + RegNo + ", Dept=" + Dept + ", Year=" + Year
				+ ", SSLC_Mark=" + SSLC_Mark + ", HSC_Mark=" + HSC_Mark + ", CGPA=" + CGPA + "]";
	}
	
	

}
