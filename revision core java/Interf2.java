
interface que{
  //int x= 5;
    void fun2();
}



class A implements que{
    int x= 5;
 public void fun2(){
    int x=2;
 System.out.println(x);
}
}

class Interf2{
    public static void main(String[]args){
      A obj = new A();
      obj.fun2();
    }
}

