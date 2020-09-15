package day.six;

class AgeExceptions extends Exception{
	public String toString() {
		return "Invalid Age Entered";
	}
}
class Persons{
private int age;
private String name;

public Persons(int age,String name) throws AgeExceptions {
	super();
	 if(age>=1 && age<130){
	this.age=age;
	this.name=name;
}else{
	throw new AgeExceptions();

}
}
	 public void show() {
		 
		 System.out.println("Age="+age);
		 System.out.println("Name="+name);
	 }
}
public class ExceptionDemo31 {
  public  static void main(String[] args) throws AgeExceptions{
	Persons p1=new Persons(34,"Sachin");
	p1.show();
	Persons p2=new Persons(23,"Dhoni");
	p2.show();
  }
}
