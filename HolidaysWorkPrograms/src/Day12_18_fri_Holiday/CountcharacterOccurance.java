package Day12_18_fri_Holiday;

public class CountcharacterOccurance 
{

	public static void main(String[] args) 
	{
		String s="Java programming Java oops";
		int totalcount=s.length(); //total length
		
		int totalcount_afterRemove=s.replace("a","").length(); //total length after removing 'a's
		int count=totalcount-totalcount_afterRemove;
		System.out.println("Number occurrences of a is:"+count);
	}

}
