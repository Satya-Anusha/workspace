package project;
import java.io.*; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class users {
	public String user_name;
    private String password;
    public String input;
    public String interest1;
    public String interest2;
    public String interest3;
    public String age;
    public String mailid;
    public String phno;
    


    public users(String user_name, String password, String input, String interest1, String interest2, String interest3,
			String age, String mailid, String phno) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.input = input;
		this.interest1 = interest1;
		this.interest2 = interest2;
		this.interest3 = interest3;
		this.age = age;
		this.mailid = mailid;
		this.phno = phno;
	}

    public static void main(String[] args) {
    	String  input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Welcome to Renzevous");
        System.out.println("Select one of the options");
        System.out.println("login");
        System.out.println("register");
        input = scanner.nextLine();


            if(input.equals("login")) {

                System.out.println("username");
                String Luser = scanner.nextLine();
                System.out.println("Password");
                String Lpassword = scanner.nextLine();
                File f1=new File("new.txt");
                FileReader fr;
                int flag = 0;
				try {
					fr = new FileReader(f1);
					BufferedReader br = new BufferedReader(fr); 
				
                String s; 
                String[] words = null;
                String choice;
                String search1;
                
                int count = 0;   
                while((s = br.readLine()) != null)   
                {
                   words = s.split(",");
                    for (int i = 0;i < words.length;i++) 
                    {
                           if (words[i].equals(Luser))   
                           {
                             if(words[i + 1].equals(Lpassword)){
                            	 System.out.println("Successfully Logged in!");
                            	 System.out.println("Plan your rendezvous "+Luser);
                            	 System.out.println("\n");
                            	 
                            	 flag = 1;
                            	 
                            	 System.out.println("Select what you want to do");
                            	 System.out.println("Search");
                            	 System.out.println("Networking");
                                 System.out.println("LogOut");
                                 System.out.println("\n");
                            	 choice = scanner.nextLine();
                            	 
                            	 switch(choice) {
                            	     
                            	     case "Search" :
                            		 
	                            		 System.out.println("Select what hobby you want to search");
	                            		 System.out.println("Badminton\n");
	                                     System.out.println("Chess\n");
	                                     System.out.println("Bowling\n");
	                                     System.out.println("BasketBall\n");
	                                     System.out.println("Painting\n");
	                                     search1 = scanner.nextLine();
	                                     
	                                     switch(search1) {
	                                     
	                                     case "Badminton" :
	                                    	 System.out.println("The available badmintion players are");
	                                    	 FileReader f  = null;
	                                 	    BufferedReader b = null;
	                                 		
	                                 		try {
	                                 			
	                                 			f = new FileReader("badminton.txt");
	                                 			b = new BufferedReader(f);
	                                 			
	                                 			String st;
	                                 			while((st = b.readLine()) != null) {
	                                 				System.out.println(st);
	                                 				
	                                 			}
	                                 		} catch(FileNotFoundException e) {
	                                 			e.printStackTrace();
	                                 			
	                                 		} catch(IOException e) {
	                                 			e.printStackTrace();
	                                 		}
	                                    	 break;
	                                    	 
	                                     case "Chess" :
	                                    	 System.out.println("The available Chess players are");
	                                    	 FileReader frr  = null;
		                                 	    BufferedReader brr = null;
		                                 		
		                                 		try {
		                                 			
		                                 			frr = new FileReader("chess.txt");
		                                 			brr = new BufferedReader(frr);
		                                 			
		                                 			String st;
		                                 			while((st = brr.readLine()) != null) {
		                                 				System.out.println(st);
		                                 				
		                                 			}
		                                 		} catch(FileNotFoundException e) {
		                                 			e.printStackTrace();
		                                 			
		                                 		} catch(IOException e) {
		                                 			e.printStackTrace();
		                                 		}
	                                    	 break;
	                                    	 
	                                     case "Bowling" :
	                                    	 System.out.println("The available Bowling players are");
	                                    	 FileReader fr2  = null;
		                                 	    BufferedReader br2 = null;
		                                 		
		                                 		try {
		                                 			
		                                 			fr2 = new FileReader("bowling.txt");
		                                 			br2 = new BufferedReader(fr2);
		                                 			
		                                 			String st;
		                                 			while((st = br2.readLine()) != null) {
		                                 				System.out.println(st);
		                                 				
		                                 			}
		                                 		} catch(FileNotFoundException e) {
		                                 			e.printStackTrace();
		                                 			
		                                 		} catch(IOException e) {
		                                 			e.printStackTrace();
		                                 		}
	                                    	 break;
	                                    	 
	                                     case "Basketball" :
	                                    	 System.out.println("The available BasketBall players are");
	                                    	 FileReader fr3  = null;
		                                 	    BufferedReader br3 = null;
		                                 		
		                                 		try {
		                                 			
		                                 			fr3 = new FileReader("basketball.txt");
		                                 			br3 = new BufferedReader(fr3);
		                                 			
		                                 			String st;
		                                 			while((st = br3.readLine()) != null) {
		                                 				System.out.println(st);
		                                 				
		                                 			}
		                                 		} catch(FileNotFoundException e) {
		                                 			e.printStackTrace();
		                                 			
		                                 		} catch(IOException e) {
		                                 			e.printStackTrace();
		                                 		}
	                                    	 break;
	                                    	 
	                                     case "Painting" :
	                                    	 System.out.println("The available painting players are");
	                                    	 FileReader fr4  = null;
		                                 	    BufferedReader br4 = null;
		                                 		
		                                 		try {
		                                 			
		                                 			fr4 = new FileReader("painting.txt");
		                                 			br4 = new BufferedReader(fr4);
		                                 			
		                                 			String st;
		                                 			while((st = br4.readLine()) != null) {
		                                 				System.out.println(st);
		                                 				
		                                 			}
		                                 		} catch(FileNotFoundException e) {
		                                 			e.printStackTrace();
		                                 			
		                                 		} catch(IOException e) {
		                                 			e.printStackTrace();
		                                 		}
	                                    	 break;	 
	                                    	 
	                                     default :
	                                    	System.out.println("Enter the correct hobby");
	                                        break;
	                                     }
                                         break;
                            	     case "Networking" :
                            	    	 
                            	    	  break;
                            	    	  
                            	     case "LogOut"	:
                            	  
                            	    	 System.out.println("Successfully Logged Out\n");
                            	    	 System.exit(0);  	 
                            	    	 
                            	 }
                             }
                           }
                    } if(flag == 0){
                    	System.out.println("Enter valid credentials!");
                    }
                }
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
            }
            if (input.equals("register")) {
            	ArrayList<String> user_details = new ArrayList<String>();
            	ArrayList<String> Badminton = new ArrayList<String>();
            	ArrayList<String> Chess = new ArrayList<String>();
            	ArrayList<String> Bowling = new ArrayList<String>();
            	ArrayList<String> BasketBall = new ArrayList<String>();
            	ArrayList<String> Painting = new ArrayList<String>();
            	ArrayList<String> Interests = new ArrayList<String>();
            	
            	
                System.out.println("username\n");
                String user_name = scanner.nextLine();
                
                user_details.add(user_name);
                System.out.println(user_details);

               System.out.println("Password\n");
                String password = scanner.nextLine();
                user_details.add(password);
                System.out.println(user_details);
                
                System.out.println("Enter any three of the Interests below\n");
                System.out.println("Badminton\n");
                System.out.println("Chess\n");
                System.out.println("Bowling\n");
                System.out.println("BasketBall\n");
                System.out.println("Painting\n");
                String interest1 = scanner.nextLine();
                user_details.add(interest1);
                System.out.println(user_details);
                String interest2 = scanner.nextLine();
                user_details.add(interest2);
                System.out.println(user_details);
                String interest3 = scanner.nextLine();
                user_details.add(interest3);
                
                Interests.add(interest1);
                Interests.add(interest2);
                Interests.add(interest3);
                                             
                System.out.println(user_details);
                System.out.println("Age:\n");
                String age = scanner.nextLine();
                user_details.add(age);
                System.out.println(user_details);
                System.out.println("Email:\n");
                String mailid = scanner.nextLine();
                user_details.add(mailid);
                System.out.println(user_details);
                System.out.println("Contact:\n");
                String phno = scanner.nextLine();
                user_details.add(phno);
                System.out.println(user_details);
                
                for(String choice2 : Interests) {
                	
                	switch(choice2) {
                	
                	case "Badminton" :
                		
                		Badminton.add(user_name);
                		Badminton.add(age);
                		Badminton.add(mailid);
                		Badminton.add(phoneno);
                		break;
                	
                    case "Chess" :
                		
                		Chess.add(user_name);
                		break;
                	
                    case "Bowling" :
                		
                		Bowling.add(user_name);
                		break;
                		
                    case "Basketball" :
               		
                	   BasketBall.add(user_name);
               		   break;
               		
                    case "Painting" :
                  		
                	   Painting.add(user_name);
               		   break;
               		
                	}
                }
          
                try{   
                	  	FileWriter writer = new FileWriter("new.txt",true); 
	                	writer.write("[,");
	                	for(String str: user_details) {
	                	  writer.write(str+",");
	                	}
	                	 writer.write("],");
	                 	 writer.close();  
	                    
                	
	               }catch(Exception e){System.out.println(e);} 
                
                try{   
                	FileWriter writer = new FileWriter("basketball.txt",true); 
                
                	for(String str: BasketBall) {
                	  writer.write(str+",");
                	}
                
                	writer.close();  
                   }catch(Exception e){System.out.println(e);}
                
                try{   
                	FileWriter writer = new FileWriter("chess.txt",true); 
                
                	for(String str: Chess) {
                	  writer.write(str+",");
                	}
                
                	writer.close();  
                   }catch(Exception e){System.out.println(e);}
                
                try{   
                	FileWriter writer = new FileWriter("badminton.txt",true); 
                
                	for(String str: Badminton) {
                	  writer.write(str+",");
                	}
                
                	writer.close();  
                   }catch(Exception e){System.out.println(e);}
                
                try{   
                	FileWriter writer = new FileWriter("bowling.txt",true); 
                
                	for(String str: Bowling) {
                	  writer.write(str+",");
                	}
                
                	writer.close();  
                   }catch(Exception e){System.out.println(e);} 
                
                try{   
                	FileWriter writer = new FileWriter("painting.txt",true); 
                
                	for(String str: Painting) {
                	  writer.write(str+",");
                	}
                
                	writer.close();  
                   }catch(Exception e){System.out.println(e);} 
                
                   System.out.println("Successfully Registered!\n");
                   System.out.println("Would you like to login or log out?");
                   
                   input = scanner.nextLine();
                  
                       
                   if(input.equals("login")) {
 
                	   System.out.println("You are one step away, login and get connected!! :)");
                	    
                       System.out.println("username");
                       String Luser = scanner.nextLine();
                       System.out.println("Password");
                       String Lpassword = scanner.nextLine();
                       File f1=new File("new.txt");
                       FileReader fr;
                       int flag = 0;
       				try {
       					fr = new FileReader(f1);
       					BufferedReader br = new BufferedReader(fr); 
       				
                       String s; 
                       String[] words = null;
                       String choice;
                       String search1;
                       
                       int count = 0;   
                       while((s = br.readLine()) != null)   
                       {
                          words = s.split(",");
                           for (int i = 0;i < words.length;i++) 
                           {
                                  if (words[i].equals(Luser))   
                                  {
                                    if(words[i + 1].equals(Lpassword)){
                                   	 System.out.println("Successfully Logged in!");
                                   	 System.out.println("Plan your rendezvous "+Luser);
                                   	 System.out.println("\n");
                                   	 flag = 1;
                                   	
                                   	 
                                   	 System.out.println("Select what you want to do");
                                   	 System.out.println("Search");
                                   	 System.out.println("Networking");
                                     System.out.println("LogOut");
                                     System.out.println("\n");   
                                   	 choice = scanner.nextLine();
                                   	 
                                   	 switch(choice) {
                                   	     
                                   	     case "Search" :
                                   		 
       	                            		 System.out.println("Select what hobby you want to search");
       	                            		 System.out.println("Badminton\n");
       	                                     System.out.println("Chess\n");
       	                                     System.out.println("Bowling\n");
       	                                     System.out.println("BasketBall\n");
       	                                     System.out.println("Painting\n");
       	                                     search1 = scanner.nextLine();
       	                                     
       	                                     
       	                                     
       	                                  switch(search1) {
 	                                     
 	                                     case "Badminton" :
 	                                    	 System.out.println("The available badmintion players are");
 	                                    	 FileReader f  = null;
 	                                 	    BufferedReader b = null;
 	                                 		
 	                                 		try {
 	                                 			
 	                                 			f = new FileReader("badminton.txt");
 	                                 			b = new BufferedReader(f);
 	                                 			
 	                                 			String st;
 	                                 			while((st = b.readLine()) != null) {
 	                                 				System.out.println(st);
 	                                 				
 	                                 			}
 	                                 		} catch(FileNotFoundException e) {
 	                                 			e.printStackTrace();
 	                                 			
 	                                 		} catch(IOException e) {
 	                                 			e.printStackTrace();
 	                                 		}
 	                                    	 break;
 	                                    	 
 	                                     case "Chess" :
 	                                    	 System.out.println("The available Chess players are");
 	                                    	 FileReader frr  = null;
 		                                 	    BufferedReader brr = null;
 		                                 		
 		                                 		try {
 		                                 			
 		                                 			frr = new FileReader("chess.txt");
 		                                 			brr = new BufferedReader(frr);
 		                                 			
 		                                 			String st;
 		                                 			while((st = brr.readLine()) != null) {
 		                                 				System.out.println(st);
 		                                 				
 		                                 			}
 		                                 		} catch(FileNotFoundException e) {
 		                                 			e.printStackTrace();
 		                                 			
 		                                 		} catch(IOException e) {
 		                                 			e.printStackTrace();
 		                                 		}
 	                                    	 break;
 	                                    	 
 	                                     case "Bowling" :
 	                                    	 System.out.println("The available Bowling players are");
 	                                    	 FileReader fr2  = null;
 		                                 	    BufferedReader br2 = null;
 		                                 		
 		                                 		try {
 		                                 			
 		                                 			fr2 = new FileReader("bowling.txt");
 		                                 			br2 = new BufferedReader(fr2);
 		                                 			
 		                                 			String st;
 		                                 			while((st = br2.readLine()) != null) {
 		                                 				System.out.println(st);
 		                                 				
 		                                 			}
 		                                 		} catch(FileNotFoundException e) {
 		                                 			e.printStackTrace();
 		                                 			
 		                                 		} catch(IOException e) {
 		                                 			e.printStackTrace();
 		                                 		}
 	                                    	 break;
 	                                    	 
 	                                     case "Basketball" :
 	                                    	 System.out.println("The available BasketBall players are");
 	                                    	 FileReader fr3  = null;
 		                                 	    BufferedReader br3 = null;
 		                                 		
 		                                 		try {
 		                                 			
 		                                 			fr3 = new FileReader("basketball.txt");
 		                                 			br3 = new BufferedReader(fr3);
 		                                 			
 		                                 			String st;
 		                                 			while((st = br3.readLine()) != null) {
 		                                 				System.out.println(st);
 		                                 				
 		                                 			}
 		                                 		} catch(FileNotFoundException e) {
 		                                 			e.printStackTrace();
 		                                 			
 		                                 		} catch(IOException e) {
 		                                 			e.printStackTrace();
 		                                 		}
 	                                    	 break;
 	                                    	 
 	                                     case "Painting" :
 	                                    	 System.out.println("The available painting players are");
 	                                    	 FileReader fr4  = null;
 		                                 	    BufferedReader br4 = null;
 		                                 		
 		                                 		try {
 		                                 			
 		                                 			fr4 = new FileReader("painting.txt");
 		                                 			br4 = new BufferedReader(fr4);
 		                                 			
 		                                 			String st;
 		                                 			while((st = br4.readLine()) != null) {
 		                                 				System.out.println(st);
 		                                 				
 		                                 			}
 		                                 		} catch(FileNotFoundException e) {
 		                                 			e.printStackTrace();
 		                                 			
 		                                 		} catch(IOException e) {
 		                                 			e.printStackTrace();
 		                                 		}
 	                                    	      	 break;	 
       	                                    	 
       	                                     default :
       	                                    	System.out.println("Enter the correct hobby");
       	                                        break;
       	                                     }
                                                break;
                                   	     case "Networking" :
                                   	    	 
                                   	    	  break;
                                   	    	  
                                   	     case "LogOut"	:
                                   	  
                                   	    	 System.out.println("Successfully Logged Out\n");
                                   	    	 System.exit(0);  	 
                                   	    	 
                                   	 }
                                    }
                                  }
                           } if(flag == 0){
                           	System.out.println("Enter valid credentials!");
                           }
                       }
       				} catch (FileNotFoundException e) {
       					e.printStackTrace();
       				} catch (IOException e) {
       					// TODO Auto-generated catch block
       					e.printStackTrace();
       				}  
                   } else if(input =="LogOut") {
                	   System.out.println("Successfully logged out of the program\n");
                	   System.exit(0);
                   }
                   
               }   
    }

    public static void appendStrToFile(String fileName, String str) 
{ 
try { 

// Open given file in append mode. 
BufferedWriter out = new BufferedWriter( 
new FileWriter(fileName, true)); 
out.write(str); 
out.close(); 
} 
catch (IOException e) { 
System.out.println("exception occoured" + e); 
} 
		
	}
}
