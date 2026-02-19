interface i1{
    int x=2;
    void f1();
    static void f2(){
        System.out.println(x);
    }
}
    interface i2 extends i1{
        int y=2;
        void f3();
        static void f2(){
        System.out.println(x);
    }
    }
    class c1 implements i2{
        public void f1(){
        }
      //  static void f2(){
        System.out.println(x);
    
        public void f3(){
   System.out.println(x);
        }
    }
    

class Interf{
    public static void main(String[]args){
  // i2.f2();
  //i1.f2();
  c1 obj = new c1();
  System.out.println(obj.x);
  obj.f2();
    }
}