import  java.io.*;
class Exceptionh4{
    public static void main(String[]args) {
        System.out.println("hello");
        try{
        throw new IOException("printer not found");
        }
        catch(IOException e1){
    System.out.println(e1.getMessage());
        }
    }
}