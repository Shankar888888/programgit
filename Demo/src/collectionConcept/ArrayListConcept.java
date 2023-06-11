package collectionConcept;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListConcept {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
// TODO Auto-generated method stub 
	int a[]=new int[5];//static array-->Size id fixed

         //Dynamic array---ArrayList
        //Syntax

         //ArrayList ar=new ArrayList();

         //1.ArrayList can cantain duplicate elements  
        //2.inseration order is maintains
        //3.ArrayList---Synchronized
        //4.Allow random access
 
 
 ArrayList al=new ArrayList();
 al.add(1);//0
 al.add(2);//1
 al.add(3);//2
 al.add(4);//3
 al.add(1);//4
 al.add(true);
 al.add(20.00);
 al.add("nucot");
 al.add('s');
 System.out.println(al.size());
 System.out.println(al.get(0));
 System.out.println(al.contains(2));
 System.out.println(al.toArray());

 //print All the elements
 //1.Using for loop
 //2.Using iterator

for(int i=0;i<al.size();i++)
{
 System.out.println(al.get(i));
 
}
 
 ArrayList<Integer> al1=new ArrayList<Integer>();
 al1.add(12);
 System.out.println(al1.get(1));
 System.out.println(al1.size());
 
 ArrayList<String> al2=new ArrayList<String>();
 al2.add("nucot");
 al2.add("soma");
 System.out.println(al2.size());
 System.out.println(al2.get(3)); 
 //Object details
  System.out.println("First student details");
  StudentDetails sd1=new StudentDetails("abc",123,"xyz",5);
   //Object details
  
 }
}


