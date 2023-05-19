package JavaInterviewPrograms;

public class Sorting_Numbers {

	public static void main(String[] args) {
		int i,j,temp;
		String num1="43235452";
		char c[]=num1.toCharArray();
		char num;
//		System.out.println(num);
		for(i=0;i<c.length;i++)
		{
			for(j=i;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					num=c[i];
					c[i]=c[j];
					c[j]=num;
				}
			}
		}
		System.out.println(c);
		

	}

}
