
/*class Demo{
    int x;
    int y;
    Demo(){
//System.out.println("constructor 1 excuted");
x=5;
y=6;
    }
    void fun1(){
      x= 22;
      y= 23;
        //System.out.println("function 1 executed");
    }
}
class Construct{
    public static void main(String[]args){
 Demo d1 = new Demo();
// Demo d2 = new Demo();     
// Demo d3 = new Demo();
d1.fun1();
System.out.println(d1.x);
System.out.println(d1.y);
    }
}
*/
class Demo{
 int x,y
 // constructor over loading because two constructor same name but different 
 //parameters
 // two parameter
 Demo(int p, int q){
x = p;
y = q;
    }
    // no parameter
    Demo(){

    }
}
class Construct{
    public static void main(String[]args){
        Demo d1 = new Demo(5,6);
        //two parameters
        Demo d2 = new Demo(7,9);
        //no parameters;
        Demo d3 = new Demo();

    }
}