package JavaInterviewPrograms;

public class CountOfCharacters {

	public static void main(String[] args) {
		/*
		 * Given an input string = aabbbccccaaaaa, maintain the insertion order and output a2b3c4a5.
		 */
		
		String str="aabbbaccccaaaaabbcc";
		String output="";
		String c = "";
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				count++;
			}
			else
			{
				c=Character.toString(str.charAt(i-1));
				output=output+c+count;
				count=1;
			}
		}
		c=Character.toString(str.charAt(str.length()-1));
		output=output+c+count;
		
		System.out.println(output);
	}

}
