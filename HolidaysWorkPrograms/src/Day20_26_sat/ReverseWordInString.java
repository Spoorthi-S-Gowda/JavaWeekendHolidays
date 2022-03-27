package Day20_26_sat;

public class ReverseWordInString 
{

	public static void main(String[] args)
	{
		String str="Welcome To Java";//original string
		String[] words=str.split(" ");//splitting string into words
		String reverseString=" ";
		
		for(String w:words)
		{
			String reverseword=" ";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+" ";
			
		}
		System.out.println(reverseString);

	}

}
