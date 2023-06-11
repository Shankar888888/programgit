package create;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n[]= {5,6,8,9,10};
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
        	sum=sum+n[i];
        	
        }
        System.out.println(sum);
        int total=0;
        for(int j=5;j<=10;j++)
        {
        	total=total+j;
        	
        }
        System.out.println(total);
        int missingnumber=total-sum;
        System.out.println("the missing number is"+missingnumber);
	}

}
