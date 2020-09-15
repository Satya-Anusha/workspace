package day.six;

class AgeException extends Exception{
	public String toString() {
		return "Invalid Age Entered";
	}
};
class Person{
private int age;
private String name;

public Person(int age,String name){
	super();
	 if(age>=1 && age<130){
	this.age=age;
	this.name=name;
}else{
	try{
	throw new AgeException();
}catch(AgeException e){
	e.printStackTrace();

}
}
}
	 public void show() {
		 
		 System.out.println("Age="+age);
		 System.out.println("Name="+name);
	 }
}
public class ExceptionDemo3 {
  public  static void main(String[] args){
	Person p1=new Person(-34,"Sachin");
	p1.show();
	Person p2=new Person(-23,"Dhoni");
	p2.show();
  }
}
