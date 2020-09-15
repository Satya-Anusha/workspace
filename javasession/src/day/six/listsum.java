package day.six;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class listsum{
	public static void main(String[] args) {
	  List <Integer>list=new ArrayList<Integer>();
	  list.add(40);
	  list.add(50);
	  list.add(10);
	  list.add(100);
	  list.add(200);
	  
	  System.out.println(list);
	  int sum=0;
	  for(Integer x:list){
		  sum=sum+x;
		  
	  }
	  System.out.println(sum);
	}
}