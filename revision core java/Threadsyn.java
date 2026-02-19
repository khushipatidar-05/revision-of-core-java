import java.util.Scanner;
class Account{
      int bal;
    Account( int b){
      bal = b;
    }
   boolean issufficentBal(int w){
        if(bal>w){
      return true;
        } 
        else{
            return false;
        }
    }
    void withdraw(int amt,String g1){
        bal = bal- amt;
        System.out.println("Transction successfully:");
          System.out.println("current  balance in " +bal);
    }
 }
 class Customer implements Runnable{
    String m1;
   Account x1;
   Customer( Account j1, String h1){
    x1 = j1;
    m1 = h1;
   }
  public  void run(){
    Scanner sc = new Scanner(System.in);
    synchronized(x1){
    System.out.println("enter the balance to withdraw " +m1+":");
    int amt = sc.nextInt();
    if(x1.issufficentBal(amt)){
        x1.withdraw(amt,m1);
    }
    else{
        System.out.println("insufficient balance:");
    }
  }
 }
 }
class Threadsyn{
    public static void main(String[]args){
      Account  a1 = new Account(5000);
      Customer c1  = new Customer(a1,"amit");
      Customer c2 = new Customer(a1,"sumit");
      Thread t1 = new Thread(c1);
      Thread t2 = new Thread(c2);
      t1.start();
      t2.start();
    }
}