package day.eight;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;


public class FileDemo1 {
 public static void main(String[] args)  {
     FileWriter fw=null;
     BufferedWriter bw=null;
     try{
         fw=new FileWriter("test.txt");
         bw=new BufferedWriter(fw);
         bw.write("Hello World\n");
         bw.write("Hai World\n");
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