import java.io.*;
class Fileh2{
    public static void main(String[]args)throws IOException{
         String s1 =  "khushipatidar";
         // File h1 = new File("a.txt");
        FileOutputStream f1 = new FileOutputStream("a.txt",true);
      //  f1.write('C');
      // file write  krte h lakin ek br me ek hi character likh skte h
      char c1[] = s1.toCharArray();
      System.out.println(s1.length());
       // above array use to convert String to character it is character array
      for(int i =0; i<c1.length; i++){
    f1.write(c1[i]);
      }
        f1.close();
    }
}