package day.seven;
import java.util.Comparator;

import day.seven.Employee;

public class Sortbyname implements Comparator<Employee>{

@Override
public int compare(Employee emp1, Employee emp2) {
// TODO Auto-generated method stub
if(emp1.getName().compareTo(emp2.getName()) > 0){
return 1;
}else if(emp1.getName().compareTo(emp2.getName()) < 0){
return -1;
}else
return 0;
}
}