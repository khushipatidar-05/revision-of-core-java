import java.util.*;
class Cursors2{
    public static void main(String[]args){
        Vector v1 = new Vector();
        v1.add("K");
        v1.add("H");
        v1.add("U");
        v1.add("S");
        v1.add("H");
        v1.add("I");
        Iterator k1 =v1.iterator();
        while(k1.hasNext()){
            String s1 = (String)k1.next();
            if(s1=="K" || s1=="U"){
                k1.remove();
            }
            else{
            System.out.println(s1);
            }
        }
    }
}