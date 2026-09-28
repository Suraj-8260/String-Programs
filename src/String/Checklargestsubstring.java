package String;

public class Checklargestsubstring {
	public static void main(String[] args)
	{
		String str="I hate programming in java";
		String[] words=str.split(" ");
		String longestword="";
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>longestword.length()) {
				longestword=words[i];
			}
		}
		System.out.println(longestword);
	}
}
