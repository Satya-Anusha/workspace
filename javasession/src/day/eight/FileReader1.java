package day.eight;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class FileReader1 {
 public static void main(String[] args)  {
     FileReader fw=null;
     BufferedReader bw=null;
     try{
         fw=new FileReader("test.txt");
         bw=new BufferedReader(fw);
         String st;
         while((st=bw.readLine())!=null){
             System.out.println(st);
         }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
     catch (IOException e){
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