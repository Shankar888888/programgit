package create;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Nucot";
		//String s2="Nucot";
		//String s3="nucot";
		//if(s1==s3)
		//{
			//System.out.println("both are same");
		//}
          //System.out.println("both are not same");
          //System.out.println(s1==s2);
          //System.out.println(s1==s3);
		//second way-- string ob1ects with new keyword
		//syntax -- creating object
		//class_name objname=new class_cunstructor;
	//	String s11=new String("Nucot");
		//System.out.println(s1==s11);//== comparing memory location;
		//System.out.println(s1.equals(s11));//dot equals comparing contents
		 //---(intern)
		//it means create both scp and heap memory
		String s12=new String("Nucot");
		s12.intern();
		//System.out.println(s12==s12);
		System.out.println(s12.equals(s12));
	}

}
