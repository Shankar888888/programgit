package exceptionconcept.com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> StuList=new ArrayList<Object>();
		StuList.add("abc");
		StuList.add("xyz");
		StuList.add(20);
		StuList.add("xyz");
		StuList.add(true);
        System.out.println(StuList.size());
        System.out.println("****Details of student****");
        //using for loop
        for(Object ob:StuList)
        {
        	System.out.println(ob);
        }
        System.out.println("******with out using details of student******");
        System.out.println(StuList);
     
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);

        //other way
        List<Integer> ll=new ArrayList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println("Before removing the value");
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println("After removing the value");
        System.out.println(ll.size());
        System.out.println(ll);
        System.out.println(ll.get(3));
        
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        System.out.println(numbers);
        List<String> Sl= Arrays.asList("aaa","bbb","ccc","ddd","eee","fff");
        System.out.println(Sl);
       
        
        //sort elements
        ArrayList<Integer> ob1=new ArrayList<Integer>();
        ob1.add(5);
        ob1.add(3);
        ob1.add(2);
        ob1.add(1);
        ob1.add(4);
        
        System.out.println(ob1);
        Collections.sort(ob1);
        System.out.println(ob1);
        Collections.reverse(ob1);
        System.out.println(ob1);
        
        //stat5c array sort
        int a[]= {3,4,11,2,5,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        
        ArrayList<String> names=new ArrayList<String>();
        names.add("abc");
        names.add("efg");
        names.add("hij");
        names.add("klm");
        names.add("nop");
       /* 
        //retrive the elements
        String s1=names.get(0);
        String s2=names.get(1);
        String s3=names.get(2);
        String s4=names.get(3);
        String s5=names.get(4);
        
        //print the elements
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
       
        //print directly all the elements
        System.out.println(names);
        System.out.println(names.size());
        */
        //other way to print
        int ss= names.size();
        System.out.println(ss);
        System.out.println(names);
        
        //contains method use to checking values is present in the list or not
       if( names.contains("zyx"))
    		   {
    	          System.out.println(names);
    		   }
       else
       {
    	   System.out.println(" enter correct values");
       }
        
        
        boolean cb=names.contains("nop");
        
        System.out.println(cb);
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
