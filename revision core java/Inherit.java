class Vivo1{
 int x;
 int y;
 Vivo1(int p,int q){
    System.out.println("parent constructor executed:");
 x = p;
 y=q;
 System.out.println(x);
  System.out.println(y);
 }
 void f1(){
    System.out.println("parent function 1 executed:");
 }
  void f2(){
    System.out.println("parent function 2 executed:");
 }
}
class Vivo2 extends Vivo1{
int z;
Vivo2(){
    super(6,7); // by default complier bhii likh deta h :
    System.out.println("child constructor executed :");
}
void f3(){
    System.out.println("child function 3 executed:");
}
}
//hierarchical inheritance
/*class Vivo3 extends Vivo1{

}
*/
class Inherit{
    public static void main(String[]args){
         Vivo2 v1 = new Vivo2();
         
       //  v1.f3();

    }
}