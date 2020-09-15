package day.five;

public class ExceptionDemo2 {
public static void main(String[] args) {
int a=10,b=0;
        int c=a/b;
        try {
        	if(b==0)
        		throw new ArithmeticException();
                System.out.println("The div is:"+c);
        }
             catch(ArithmeticException e) {
             e.printStackTrace();
        }
System.out.println("Program ends successfully");
}

}
