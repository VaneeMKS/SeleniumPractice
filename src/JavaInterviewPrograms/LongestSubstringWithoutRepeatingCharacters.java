package JavaInterviewPrograms;
import java.lang.reflect.Array;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		/*
		 * Find start index, last index of non repeating characters
		 * 
		 */
		String str="abdfacaddeffgh";
		String value = "";
		String output="";
		List l=new ArrayList();
		int i,j,startIndex=0,lastIndex=0;
		for(i=0;i<str.length();i++)
		{
//			value=value+str.charAt(i);
			if(str.charAt(i)==str.charAt(i+1))
			{
				l.add(value);
				value="";
				
			}
			else
			{
				value=value+str.charAt(i);
			}
				
//			l.add(value);
//			value="";
//			value=value+str.charAt(j);
			
		}
		System.out.println(l);
		
	}
	

}
