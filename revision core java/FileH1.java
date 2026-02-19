import java.io.*;
class FileH1{
 public static void main(String[]args) throws IOException{
    // File class isrif meta data rkhti information rkhti h only
    File f1 = new File("a.txt");
  //is me harddisk carrupt rhii to file create nhii hogi 
  // compile time exception h isliye throw krvage compliler ko 
  f1.createNewFile();
  System.out.println(f1.exists());
  System.out.println(f1.canWrite());
  System.out.println(f1.length());

 }
}