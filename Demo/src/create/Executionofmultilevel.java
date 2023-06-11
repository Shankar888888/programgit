package create;

public class Executionofmultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("this is the parent class AAA");
     AAA aa=new AAA();
     aa.add();
     
     System.out.println("this is the child class BBB");
     BBB bb=new BBB();
     bb.mul();
     //bb.add();
     System.out.println("this is the child  class CCC");
     CCC cc=new CCC();
     cc.sub();
	}

}
