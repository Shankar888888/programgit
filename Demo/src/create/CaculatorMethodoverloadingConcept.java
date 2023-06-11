package create;

public class CaculatorMethodoverloadingConcept {
	int add(int a,int b)
	{
		int sum=a+b;
		//return sum;
		return a+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaculatorMethodoverloadingConcept obj33=new CaculatorMethodoverloadingConcept();
		int R=obj33.add(2,3);
		System.out.println(R);
	}

}
