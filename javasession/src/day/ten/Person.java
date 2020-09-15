package day.ten;


class Person {	
	private int age;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String address;
	private String interest;
	private double mobile;
	
	public Person(){}
	
	public Person(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	//it is automatically called when object is used inside syso
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee(100,"SACHIN","TENDULKAR",9898.98);
		System.out.println(employee1); //it calls toString()
		Employee employee2 = new Employee(101,"DHONI","MAHENDER",7777.77);
		System.out.println(employee2);
	}
}