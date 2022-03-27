package Day21_27_sun;

import java.io.*;

public class Palindrome 
{
	//Function to check paalindrome
	static boolean checkPalindrome(String str)
	{
		//calculating string length
		int len=str.length();
		
		//Traversing through the string
		//upto half its length
		for(int i=0;i<len/2;i++)
		{
			//comparing ith character
			//from starting and len-ith
			//character from end
			if(str.charAt(i)!=str.charAt(len-i-1))
				return false;
		}
		//If the above loop doesn't return then
		//it is palindrome
		return true;
	}
	//Driver code
public static void main(String[] args) 
	{
	//Taking number as string
	String str="1122334455667788990000998877665544332211";
	if(checkPalindrome(str)==true)
		System.out.println("yes");
	else
		System.out.print("No");

	}

}
