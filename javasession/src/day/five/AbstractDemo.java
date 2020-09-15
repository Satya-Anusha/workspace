package day.five;
abstract class Maths{
public void add(int a,int b){
System.out.println("Add is:"+(a+b));
}
    abstract public void sub(int a,int b);
    abstract public void mul(int a,int b);

}
class Calculate extends Maths {
    @Override
public void sub(int a,int b){
System.out.println("Sub is:"+(a-b));
}
public void mul(int a,int b){
System.out.println("Product is:"+(a*b));
}
}

public class AbstractDemo {
  public static void main(String[] args) {
       Calculate calculate =new Calculate();
       calculate.add(5,10);
       calculate.sub(10,5);
       calculate.mul(10,5);
       Maths maths =new Calculate();
       maths.add(5,10);
       maths.sub(10,5);
       maths.mul(10,5);
  }
}