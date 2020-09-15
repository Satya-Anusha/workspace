package day.one;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int choice,id;
		String name;
		double amount;
		boolean flag = false;
		Customer customers[] = new Customer[10]; 
		int index = -1;

		do {
			System.out.println("1. Add Customer");
			System.out.println("2. Display All Customers");
			System.out.println("3. Display Customer By Id");
			System.out.println("4. Deposit");
			System.out.println("5. Withdraw");
			System.out.println("6. Transfers");
			System.out.println("7. E X I T");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :  System.out.println("Enter Name :");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter amount :");
			amount = sc.nextDouble();
			Customer customer = new Customer(name,amount);
			customers[++index] = customer;
			System.out.println("Customer added successfully and Id is:" + customer.getId());
			break;	
			case 2: for(int i = 0; i <= index; i++){
				System.out.println("Id :"+ customers[i].getId());
				System.out.println("Name :"+ customers[i].getName());
				System.out.println("Balance:"+ customers[i].getBalance());
			}
			break;
			case 3: System.out.println("Enter id to display :");
			       id = sc.nextInt();
			       for(int i = 0; i <= index;i++){
			    	   if(customers[i].getId() == id) {
			    		   System.out.println("Id :"+ customers[i].getId());
							System.out.println("Name :"+ customers[i].getName());
							System.out.println("Balance:"+ customers[i].getBalance());
							flag = true;
							break;
			    	   }
			       }
			       if(flag == false)
			    	   System.out.println("Not found");
			       
			}
		}while(choice<7);
	}
}
