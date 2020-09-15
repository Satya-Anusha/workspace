package day.seven;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class collectionDemo11 {
public static void main(String[] args) {
	List <Employee>emplist=new ArrayList<Employee>();
	Employee employee1=new Employee(101,"sachin",9999.99);
	emplist.add(employee1);
	Employee employee2=new Employee(102,"rahul",9989.11);
	emplist.add(employee2);
	Employee employee3=new Employee(103,"rohith",9699);
	emplist.add(employee3);
	Employee employee4=new Employee(104,"ramu",9997);
	emplist.add(employee4);
	Employee employee5=new Employee(105,"raju",9998);
	emplist.add(employee5);
	System.out.println("Objects: "+emplist);
	Collections.sort(emplist);
	for (Employee emp:emplist){
		System.out.println("Id "+emp.getId());
		System.out.println("Name "+emp.getName());
		System.out.println("Salary "+emp.getSalary());
	}
}
}
