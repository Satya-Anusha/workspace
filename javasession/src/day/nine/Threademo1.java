package day.nine;
/*
class: Thread:-seperate path of execution
why thread:-for multitasking
user defined exception:- extends exception
1.Create a class by extending thread
2.override the run() by ur code
3.Create object and invoke start method
4.two threads are working parent,child
5.thread ,threadscheduler,run
difference between extends threda

*/
class MyThread extends Thread{
	public void run() {	
		System.out.println("current thread is :"+Thread.currentThread());
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
}
public class Threademo1 {
public static void main(String[] args){
	System.out.println("Current thread is:"+Thread.currentThread());
	MyThread mythread=new MyThread();
	mythread.start();
	
}
}
