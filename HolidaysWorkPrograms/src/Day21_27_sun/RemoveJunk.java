package Day21_27_sun;

public class RemoveJunk 
{

	public static void main(String[] args) 
	{
		String s="?*/+@#&!$$ latin String 01234567890";
		String s1="@#$@#$@ Java #@$@#$@#$ Program !@#$@#$@#&&&& opps";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		s1=s1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);

	}

}
