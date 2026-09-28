package String;

public class Foundcharacter {
	public static void main(String[] args)
	{
		String str="hello world";
		char searchchar='w';
		boolean found=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==searchchar)
			{
				found=true;
			}
		}
		if(found)
		{
			System.out.println("character is present");
		}
		else
		{
			System.out.println("character is not present");
		}
	}
}
