package JavaInterviewPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		int i=0,j=1	,k;
		int temp;
		for(k=0;k<10;k++)
		{
			temp=i+j;
			i=j;
			j=temp;
			
			System.out.println(i);
		}
	}

}
