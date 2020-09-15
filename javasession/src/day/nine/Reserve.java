package day.nine;
class book implements Runnable{
	private int available=1;
	private int ticketsWanted;
 public book(){
}
 public void setTicketsWanted(int ticketsWanted){
	 this.ticketsWanted=ticketsWanted;
 }
@Override
public synchronized void run() {
	System.out.println("Available Berths=" +available);
	if(available  >= ticketsWanted){
		String name=Thread.currentThread().getName();
		System.out.println(ticketsWanted + "Berths alloted for " + name) ;
	try{ 
		available=available-ticketsWanted;
		Thread.sleep(1000);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	}
}
	}
	public class Reserve {
             public static void main(String[] args){
            	 book bk=new book();
            	 bk.setTicketsWanted(1);
            	 Thread t1=new Thread(bk);
            	 bk.setTicketsWanted(1);
            	 Thread t2=new Thread(bk);
            	 t1.setName("First person");
            	 t2.setName("Second person");
            	 t1.start();
            	 t2.start();
             }
	}
		

