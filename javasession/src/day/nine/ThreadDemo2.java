package day.nine;
/*
 computer is a electronic device which performs millions of instructions per second
 interface:Runnable
 class names and interface names differ in  such a way that action includes in interface name and thread is a noun form. 
 1.Create a new class by implementing runnable
 2.we must override run method and write code
 3.create object of newly created class and  create a thread class object by passing above object to the constructor
 invoke the start method using the thread class object. 
 5.runnable interface has complicated code than normal thread method because we cannot use multiple inheritance in java
 locking one thread until its job completed is synchronisation
 */

class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
}
public class ThreadDemo2 {
  public static void main(String[] args){
	  MyThread2 myThread2 =new MyThread2();
	  Thread t =new Thread(myThread2);
	  t.start();
  }
}
