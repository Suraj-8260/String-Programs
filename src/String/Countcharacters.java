package String;

public class Countcharacters {
	public static void main(String[] args)
	{
		String str="hello";
		char searchchar='o';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==searchchar)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
