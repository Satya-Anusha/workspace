package day.eight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.jws.soap.SOAPBinding;

public class FileDemo11 {
 public static void main(String[] args)  {
     FileWriter fw=null;
     BufferedWriter bw=null;
     try{
         fw=new FileWriter("test.txt",true);
         bw=new BufferedWriter(fw);
         bw.write("Welcome \n");
         System.out.println("File created successfully");
     } catch (IOException e){
         e.printStackTrace();
     }
     finally{
         try{
             bw.close();
             fw.close();
         }
         catch (IOException e){
             e.printStackTrace();
         }
         }
     }
 }