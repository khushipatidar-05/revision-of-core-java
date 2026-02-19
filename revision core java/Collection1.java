 // collection interface h isliye collection1 name ki class bnai.
import java.util.*;
class Collection1{
    public static void main(String[]args){
       ArrayList l1 = new ArrayList(6);
       l1.add("k");
       l1.add("h");
       l1.add("U");
       l1.add("S");
       l1.add("h");
       l1.add( 2,"i");
     Iterator g1 = l1.iterator();
     while(g1.hasNext()){
        String s1 =(String)g1.next();
        if(s1!="i"){
            System.out.println(s1);
        }
     //   System.out.println(g1.next());
     }
    }
}