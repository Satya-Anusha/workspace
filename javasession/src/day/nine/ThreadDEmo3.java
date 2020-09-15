package day.nine;
class ChildThread1 extends Thread{
	public void run(){
		System.out.println("current thread is :"+Thread.currentThread());
		for(int i=1;i<=5;i++){
	     try{
	    	 System.out.println(i);
	    	 Thread.sleep(000);
	     }catch(InterruptedException e){
	    	 e.printStackTrace();
	     
	     }
		}
	}
}
class ChildThread2 extends Thread{
	public void run(){
		System.out.println("current thread is :"+Thread.currentThread());
		for(int i=6;i<=10;i++){
			try{
		    	 Thread.sleep(1000);
		     }catch(InterruptedException e){
		    	 e.printStackTrace();
		     
		     }
	     System.out.println(i);		
		}
	}
}
public class ThreadDEmo3 {
	public static void main(String[] args){
		System.out.println("current thread is :"+Thread.currentThread());
		ChildThread1 childthread1 =new ChildThread1();
		childthread1.start();
		ChildThread2 childthread2 =new ChildThread2();
		childthread2.start();
	}
}
