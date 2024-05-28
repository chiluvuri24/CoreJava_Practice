package com.rr.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		Employee e3 = new Employee(new Integer(286), "siva",3000,"it");
		   Employee e1 = new Employee(new Integer(199),"ram",4000,"sales");
		   Employee e2 = new Employee(new Integer(26), "siva",2000,"admin");
		   Employee e4 = new Employee(new Integer(45),"jay",16000,"sales");
		   Employee e5 = new Employee(new Integer(78), "vish",20000,"it");
		   Employee e6 = new Employee(new Integer(71),"jack",45000,"it");
		   Employee e7 = new Employee(new Integer(345), "daniel",21000,"sales");
		  // Stream.of(e1,e2,e3).sorted((emp1,emp2)->emp2.getId().compareTo(emp1.getId())).forEach(e->System.out.println(e));;
		   
		   
		   Map<String, List<Employee>> empsByDept = Stream.of(e1,e2,e3,e4,e5,e6,e7).collect(Collectors.groupingBy(Employee::getDept));
		   
		   empsByDept.forEach((dept, empsInDept)->{
			   System.out.println(dept +" ::");
			   
			   empsInDept.forEach(emp->System.out.println(emp));
			   
			   
		   });
		   
		   
		   
	}
}

class Employee{
	private Integer id;
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	private String dept;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public Employee(Integer id, String name, double salary, String dept) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id="+this.id+", name="+this.name+"]";
	}
	
}