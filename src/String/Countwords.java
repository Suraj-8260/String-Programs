package String;

public class Countwords {
	public static void main(String[] args)
	{
		String str="hello world how are you";
		int spacecount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				spacecount++;
			}
		}
		int wordcount=spacecount+1;
		System.out.println(wordcount);
	}
}
