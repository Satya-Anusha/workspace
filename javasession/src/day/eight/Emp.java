package day.eight;
import java.io.Serializable;
public class Emp implements Serializable {
	private int id;
	private String name;
	private double salary;
	public Emp(){
		super();
	}
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
