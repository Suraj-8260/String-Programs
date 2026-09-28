package String;

public class Findindexofthecharacter {
	public static void main(String[] args)
	{
		String str="Hello world";
		char searchchar='w';
		int index=-1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==searchchar)
			{
				index=i;
			}
		}
		System.out.println(index);
	}
}
