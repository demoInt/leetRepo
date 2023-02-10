package leetCode_easy;
/*
  2000. Reverse Prefix of Word
		Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0
		and ends at the index of the first occurrence of ch (inclusive). If the character ch does not 
		exist in word, do nothing.
		For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and 
		ends at 3 (inclusive). The resulting string will be "dcbaefd".
		Return the resulting string.
		Example 1:
		Input: word = "abcdefd", ch = "d"
		Output: "dcbaefd"
		Explanation: The first occurrence of "d" is at index 3. 
		Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
		Example 2:
		Input: word = "xyxzxe", ch = "z"
		Output: "zxyxxe"
		Explanation: The first and only occurrence of "z" is at index 3.
		Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
		Example 3:
		Input: word = "abcd", ch = "z"
		Output: "abcd"
		Explanation: "z" does not exist in word.
		You should not do any reverse operation, the resulting string is "abcd".
 */
public class Q2000 {
	public static void main(String[] args) {
		
		String s = "abcdefd" ;
		char ch = 'd';
		int index = -1 ;
		boolean found = false ;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ch)
			{
				index = i;
				found = true ;
				break ;
			}
		}
		String str = "";
		if(found)
		{			
			for (int i = 0; i < s.length(); i++) {
				
				if(index-i >= 0)
				{
					str += s.charAt(index-i);
				}
				else
				{
					str += s.charAt(i);
				}
			}
			System.out.println(str);
		}
		else
		{
			System.out.println(str);
		}
		/*
		  char[] chArray = word.toCharArray();

        //Step-1 : 
        //Check if the given character exists in the given string
        int idx;
        for(idx=0; idx<chArray.length; idx++)
        {
            if(chArray[idx] == ch) break;
        }

        //Step-2:
        //If the given charater does not exist, 
        //return the given string.
        if(idx == chArray.length) return word;

        //Step-3:
        //Use 2 pointer approach to reverse the char array
        //& return as string.
        for(int left=0, right=idx; left<right; left++, right--)
        {
            char temp = chArray[left];
            chArray[left] = chArray[right]; 
            chArray[right] = temp;           
        }
        return new String(chArray);
		 */
	}
}
