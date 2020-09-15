package day.eight;

import java.io.FileNotFoundException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialDemo2 {
  public static void main(String[] args){
      FileInputStream fos =null;
      ObjectInputStream oos=null;
      Emp emp =null;
      try{
      fos=new FileInputStream("serial.txt");
      oos=new ObjectInputStream(fos);
      emp=(Emp)oos.readObject();
      System.out.println(emp);
         }catch (FileNotFoundException e){
          e.printStackTrace();
      }catch (IOException e){
          e.printStackTrace();
      } catch (ClassNotFoundException e){
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