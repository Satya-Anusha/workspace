package day.two;
class Maths {
	public void sum(int a,int b){
		System.out.println("The sum is :" + (a + b));
	}
	public void sum(int a,int b, int c){
		System.out.println("The sum is :" + (a + b + c));
	}
	public void sum(double a,double b){
		System.out.println("The sum is :" + (a + b));
	}
}
public class MethodOverload {
	public static void main(String[] args) {
		Maths math = new Maths();
		math.sum(10, 20);
		math.sum(1.2, 2.3);
		math.sum(10, 20, 20);
	}
}
