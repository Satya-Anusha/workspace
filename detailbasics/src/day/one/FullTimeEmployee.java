package day.three;

public class FullTimeEmployee {
	private int id;
	private String firstName;
	private String lastName;
	private double basic;
	private double bonus;
	private String mobile;
	
	public FullTimeEmployee(){}
	
	public FullTimeEmployee(int id, String firstName, String lastName, double basic, double bonus, String mobile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.basic = basic;
		this.bonus = bonus;
		this.mobile = mobile;
	}
	public String getFullName() {
		return firstName +" " + lastName;
	}
	public double computeSalary() {
		return basic  + bonus;
	}
	public void showDetails() {
		System.out.println("Id :" + id);
		System.out.println("Full Name: " + getFullName());
		System.out.println("Gross salary :" + computeSalary());
	}
	public void sendMessage() {
		System.out.println("Salary added to account..");
	}
}