import java.util.Scanner;
class Account{
    int bal;
    Account(int b){
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
       void withdraw(int amt,String g){
        bal = bal - amt;
        System.out.println("trancssion succefully:");
        System.out.println("current balance " +bal);
       }
    }

 class Customer implements Runnable{
    Account x1;
    String m1;
    Customer(Account j1,String h1){
        x1 = j1;
        m1 = h1;
    }
 public  void run(){
    Scanner sc = new Scanner(System.in);
    synchronized(x1){
    System.out.println("Enter the Amount to Withdraw " +m1+":");
    int amt = sc.nextInt();
    if(x1.issufficentBal(amt)){
     x1.withdraw(amt,m1);
    }
    else{
        System.out.println("insuffecient balance:");
    }
 }
 }
 }
class Bankeg2{
    public static void main(String []args) {
      Account k1 = new Account(6000);
      Customer c1 = new Customer(k1,"Andrew Aderson:");
      Customer c2 = new Customer(k1, "pretter parker:");
      Thread t1 = new Thread(c1);
      Thread t2 = new Thread(c2);
      t1.start();
      t2.start();
    }
}