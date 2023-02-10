package leetCode_easy;
//longest common prefix
public class Q14 {
	public static void main(String[] args) {

		String[] str =  {"flower","flow","flight"};

		if(str == null || str.length == 0)
			System.out.println("");
		
		String s = str[0];

		int i = 1;
		while(i < str.length)
		{
			while( str[i].indexOf(s) != 0)
				s = s.substring(0, s.length()-1);
			
			if(str.length == 0)
				System.out.println("");		
			else
				i++;
		}
		System.out.println(s);
	}
}
