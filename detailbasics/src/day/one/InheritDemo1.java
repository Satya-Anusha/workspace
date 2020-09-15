package day.one;

class Parent {
	protected int x,y;
	public Parent() {
	}
	public Parent(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void showParent() {
		System.out.println("Hi! This is parent");
	}
}
class Child extends Parent {
	private int z;
	public Child(){}
	public Child(int x,int y,int z) {
		super(x,y); //parameterised parent
		this.z = z;
	}
	public void showChild() {
		System.out.println("Hi! This is child");
	}
	public void sum() {
		System.out.println("The sum is :" + (x+y+z));
	}
}

public class InheritDemo1 {
	public static void main(String[] args) {
		Child child = new Child(10,20,30);
		child.showParent();
		child.showChild();
		child.sum();
	}
}








