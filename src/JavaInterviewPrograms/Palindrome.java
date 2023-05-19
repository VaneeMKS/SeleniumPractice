package JavaInterviewPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String str="a1b2c2b1a";
		char[] arr=str.toCharArray();
		
		String c = "";
		
		for(int i=0;i<arr.length;i++)
		{
			c=arr[i]+c;
		}
		if(str.equals(c))
		{
			System.out.println(str+" is palindrome");;
		}
		else
		{
			System.out.println(str+" is not palindrome");
		}
	}

}
