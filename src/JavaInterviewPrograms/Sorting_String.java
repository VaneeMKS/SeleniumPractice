package JavaInterviewPrograms;

import java.util.Arrays;

public class Sorting_String {
		 
	    // Main driver method
	    public static void main(String[] args) throws Exception
	    {
	        // Custom string input
	        String str = "Vijayavanee";
	        str=str.toLowerCase();
	        System.out.println(str);
	        
	        char arr[] = str.toCharArray();
	        char arr1[] = str.toCharArray();
	        char arr2[] = str.toCharArray();
	       
	        char temp;
/**************************************************************************************/	        
	        Arrays.sort(arr);
	        
	        System.out.print("Sorted using Arrays.sort: ");
	        System.out.println(arr);
/**************************************************************************************/
	        
	        for(int i=0;i<arr1.length;i++)
	        {
	        	for(int j=0;j<arr1.length;j++)
	        	{
	        		if(arr1[i]<arr1[j])
	        		{
	        			temp=arr1[i];
	        			arr1[i]=arr1[j];
	        			arr1[j]=temp;
	        		}
	        	}
	        }
	        System.out.print("Sorted using for loop: ");
	        System.out.println(arr1);
/**************************************************************************************/
	        int i = 0;
	        while (i < arr2.length) {
	            int j = i + 1;
	            while (j < arr2.length) {
	                if (arr2[j] < arr2[i]) {
	                   
	                    // Comparing the characters one by one
	                    temp = arr2[i];
	                    arr2[i] = arr2[j];
	                    arr2[j] = temp;
	                }
	                j += 1;
	            }
	            i += 1;
	        }
	        System.out.print("Sorted using while loop: ");
	        System.out.println(arr2);
	    }
	}