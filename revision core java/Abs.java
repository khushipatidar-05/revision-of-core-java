 abstract class Demo1{
   int x,y;
   void f1(){
    x=5;
    y=2;
   }
   abstract void f2();
   Demo1(){
    System.out.println("parent class constructor executed:");
   }
}
class Demo2 extends Demo1{
    int z;
    void f3(){
    z=3; 
    }
    void f2(){
    }
    Demo2(){
        System.out.println("child class constructor executed:");
    }
}
class Abs{
    public static void main(String []args){
     Demo2 d2 = new Demo2();
      d2.f1();
      d2.f3();
    }
}