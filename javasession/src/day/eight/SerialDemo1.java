package day.eight;

import java.io.FileNotFoundException;
   
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo1 {
  public static void main(String args[]){
      FileOutputStream fos =null;
      ObjectOutputStream oos=null;
      try{
      fos=new FileOutputStream("serial.txt");
      oos=new ObjectOutputStream(fos);
      Emp e=new Emp(100,"anu",9999.99);
      oos.writeObject(e);
      System.out.println("File Cretaed successfully");
      }catch (FileNotFoundException e){
          e.printStackTrace();
      }catch (IOException e){
          e.printStackTrace();
      }
      finally{
          try{
              oos.close();
              fos.close();
          }
          catch (IOException e){
              e.printStackTrace();
          }
          }
      }
      }