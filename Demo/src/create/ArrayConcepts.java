package create;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a=new int[5];
	    //a[0]=1;
		//a[1]=2;
		//a[2]=3;
		//a[3]=4;
		//a[4]=5;
		//System.out.println(a[3]);
		//System.out.println(a[4]);
		//int len=a.length;
		//System.out.println("the length of array"+len);
		//int lowerindex=0;
		//int higherindex=len-1;
		//System.out.println("the starting value of array"+lowerindex);
		//System.out.println("the ending value of array"+higherindex);
		//for(int i=0;i<5;i++)
		//{
			//System.out.println(a[i]);
		//}
		//System.out.println(Arrays.toString(a));
		//System.out.println(a);
          
		
		String  Students[]=new String[10];
		//Students[0]="a";
		//Students[1]="b";
		//Students[3]="c";
		//Students[4]="d";
		//Students[5]="e";
		//Students[6]="f";
		//Students[7]="g";
		//Students[8]="h";
		//Students[9]="i";
		//System.out.println("student details");
		//for(int i=0;i<=9;i++)
		//{
			//System.out.println(Students[i]);
		//}
		//System.out.println(Arrays.toString(Students));
	
	 //int[] aaa=new int[]{1,2,3,4,5,6,7};
	 //System.out.println(Arrays.toString(aaa));
	 //String[] bbb=new String[]{"xyz","abc","tcl"};
	 //System.out.println(Arrays.toString(bbb));
	 
	 //Students[0]="varchas";
	 //Students[1]="10";
	 //Students[2]="20.0";
	 //for(int i=0;i<Students.length;i++)
	// {
	//	 System.out.println(Students[i]);
	 //}
	 
	 //System.out.println(Arrays.toString(Students));
	 
	// Object Student1[]=new Object[] {"varchas","10","a"};
	// for(int i=0;i<Student1.length;i++)
	 //{
		// System.out.println(Student1[i]);
		 
	 //}
	 //System.out.println(Arrays.toString(Student1));
	 
	 //for each loop
	// int arr[]= {1,2,3,4,5,6,7};
	 //for(int listofelements:arr)
	 //{
	//	 System.out.println(listofelements);
	 //}
	 
	 
	 //two dimenssional array
	 //int [][] array_name=new datatype[size][size]
	 int [][] aa=new int[2][2];
	 int rows=2;
	 int colm=2;
	 aa[0][0]=1;
	 aa[0][1]=2;
	 aa[1][0]=3;
	 aa[1][1]=4;
	 for(int i=0;i<rows;i++)
	 {
		 for(int j=0;j<colm;j++)
		 {
			 System.out.println(aa[i][j]);
		 }
	 }
	 
	}
}

