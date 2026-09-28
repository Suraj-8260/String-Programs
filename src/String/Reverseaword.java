package String;

public class Reverseaword {
	public static void main(String[] args)
	{
		String str="hello world how";
		String[] words=str.split("");
		String result="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+word.charAt(j);
			}
			result=result+reverseword+" ";
		}
		System.out.println(result.trim());
	}
}
