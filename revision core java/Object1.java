class Ram{
    int x; // instance member variable
    int y;
    void fun1(){
    System.out.println("fun1");
    }
    void fun2(){ // instance member function
System.out.println("fun2");
    }
}
class Object1{
    public static void main(String []args){
    Ram r1 = new Ram();
    Ram r2 = new Ram();
    r1.fun1();
    r1.fun2();
    r1.x = 5;
    r2.x= 21;
    System.out.println("Hello");
    System.out.println(r1.y);
    System.out.println(r1.x);
    System.out.println(r2.x);
    }
}