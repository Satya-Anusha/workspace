package day.five;

public class ExceptionDemo1 {
public static void main(String[] args) {
int a=10,b=0;
        try {
         int c=a/b;
        System.out.println("The div is:"+c);
        }
catch(ArithmeticException e) {
e.printStackTrace();
        }
System.out.println("Program ends successfully");
}

}

