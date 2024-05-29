package com.Springboot.BootMVC.SpringBootMVC.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "employee_bootMVC")

public class Employee {

	@Id
	@Column(name = "empno")
	private Integer empNo;

	@Column(name = "deptno")

	private Integer deptNo;

	@Column(name = "ename")

	private String eName;

	@Column(name = "job")

	private String job;

	public Employee() {

	}

	public Employee(Integer eno, Integer dno, String enm, String jb) {

		this.empNo = eno;

		this.eName = enm;

		this.job = jb;

		this.deptNo = dno;

	}

	public Integer getEmpNo() {

		return empNo;

	}

	public void setEmpNo(Integer eno) {

		this.empNo = eno;

	}

	public Integer getDeptNo() {

		return deptNo;

	}

	public void setDeptNo(Integer dno) {

		this.deptNo = dno;

	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {

		return job;

	}

	public void setJob(String jb) {

		this.job = jb;

	}

	@Override

	public String toString() {

		return "Employee{" + "Emp No=" + empNo + ", deptNo=" + deptNo + ", EmpName='" + eName + '\'' + ", job='" + job

				+ '\'' + '}';

	}

}