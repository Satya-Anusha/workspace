package day.ten;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;


public class Searchdemo {
 public static void main(String[] args)  {
     FileWriter fw=null;
     BufferedWriter bw=null;
     try{
         fw=new FileWriter("write.txt");
         bw=new BufferedWriter(fw);
         bw.write("[);
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