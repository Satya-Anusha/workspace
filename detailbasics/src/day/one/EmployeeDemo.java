package day.three;

public class EmployeeDemo {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(100,"SACHIN","TENDULKAR",9999.99,9898.98,"9898987711");
		fullTimeEmployee.showDetails();
		fullTimeEmployee.sendMessage();
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(101,"MS","DHONI",99,198,"9898987722");
		fullTimeEmployee.showDetails();
		fullTimeEmployee.sendMessage();
	}

}
