import java.util.*;
class Cursors3{
    public static void main(String[]args){
        Vector v1 = new Vector();
        v1.add(" A ");
        v1.add(" B ");
        v1.add(" C ");
        v1.add(" D ");
        v1.add(" E ");
     ListIterator l1  = v1.listIterator();
      while(l1.hasNext()){
        String s1 = (String)l1.next();
        if(s1.equals(" A ")){
          l1.set("C programming");
        }
        else if(s1.equals(" B ")){
       l1.set("C++ programming");
        }
       else if (s1.equals(" C ")){
      l1.add("python");
        }
        else if(s1.equals(" D ")){
          l1.remove();
        }
       System.out.println(s1);
      
        else if(s1.equals(" C ")){
          l1.nextIndex();
          System.out.println(l1.nextIndex());
        }
      
      
      }
      l1  = v1.listIterator();
      while(l1.hasNext()){
        System.out.println(l1.next());
      }
    }
}