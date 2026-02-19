/*
class Exceptionh3{
    public static void main(String[]args){
        int cb = 10000;
        int wb = 14000;
        try{
            if(cb<wb){
                throw new ArithmeticException("inssufficent balance:");
            }
        cb = cb-wb;
        System.out.println("Transection succeffully:");
        }
        catch(ArithmeticException e1){
      System.out.println(e1.getMessage());
      System.out.println("Current balance " +cb);
        }
    }
}
*/
import java.util.Scanner;
class Exceptionh3{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Current balance:");
    int cb = sc.nextInt();
    System.out.println("Enter the withdraw balance:");
    int wb =  sc.nextInt();
    try{
        if(cb<wb){
            throw new ArithmeticException("inssufficient balance:");
        }
       cb = cb - wb;   
       System.out.println("Transection successfully:");
       System.out.println("Current balance "+cb);
    }
    catch(ArithmeticException e1){
      System.out.println(e1.getMessage());
      System.out.println("Current balance :" +cb);
    }
}
}