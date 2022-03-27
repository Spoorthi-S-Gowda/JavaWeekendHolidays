package Day14_20_sun;

public class RemoveWhiteSpaces 
{

	public static void main(String[] args) 
	{
		String str="Java     programming    Java     oops";
		System.out.println("Before removing the white spaces:"+str);
		str=str.replaceAll("\\s","");
		System.out.println("After removing the white spaces:"+str);

	}

}
