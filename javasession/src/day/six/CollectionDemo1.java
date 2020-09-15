package day.six;


import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDemo1 {
	public static void main(String[] args) {
	  Set <String>set=new LinkedHashSet<String>();
	  set.add("India");
	  set.add("Australia");
	  set.add("America");
	  set.add("England");
	  set.add("India");
	  
	  System.out.println(set);
	}
}
