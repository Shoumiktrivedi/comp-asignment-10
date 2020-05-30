public class Q6
{ 
    static int LongestWordLength(String str) 
    { 
        String[] words = str.split(" "); 
        int length = 0; 
          
        for(String word:words)
        { 
            if(length < word.length())
            { 
                length = word.length(); 
            }  
        } 
        return length;
    }
    { 
        String str = "I am shoumiktrivedi"; 
        {  
        System.out.println(LongestWordLength(str)); 
    } 
}
} 
    
