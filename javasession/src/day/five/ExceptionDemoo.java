package day.five;

public class ExceptionDemoo {
	public static void main(String[] args) {
		int a=10,b=0;
		        try {
		        int x[]=new int[5];
		int c=a/x[5];
		System.out.println("The div is:"+c);
		        }
		//catch(ArithmeticException e) {
		//e.printStackTrace();
		        //}
		    //catch(ArrayIndexOutOfBoundsException e) {
		//e.printStackTrace();
		        //}
		       catch(Exception e) {
		        e.printStackTrace();
		        }
		System.out.println("Program ends successfully");
		}

		}