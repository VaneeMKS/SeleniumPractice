package JavaInterviewPrograms;

import java.util.*; 
import java.io.*;
import java.lang.Character;
import java.lang.Integer;

class Practice5 {  
  public static boolean QuestionsMarks(String str) { 
  int questionMarkCount;
  Integer value1;
  Integer value2;
  boolean addsUpToTen = false;
    for(int i = 0; i < str.length(); i++)
    {
        questionMarkCount = 0;
        if(Character.isDigit(str.charAt(i)))
        {
            value1 = Character.getNumericValue(str.charAt(i)); 
            for(int j = i+1; j < str.length(); j++)
            {
                if(Character.isDigit(str.charAt(j)))
                {
                    value2 = Character.getNumericValue(str.charAt(j));
                    
                    if(value1 + value2 == 10)
                    {
                        
                        addsUpToTen = true;
                        
                        if(questionMarkCount != 3)
                        {
                            return false;
                        }
                        
                        break;
                    }
                    
                }
                
                else if(str.charAt(j) == '?')
                {
                    questionMarkCount += 1;
                }
                
            }
        }
    }
    
    if(!addsUpToTen)
    {
        return false;
    }
    
    else
    {
        return true;
    }
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }   
  
}

