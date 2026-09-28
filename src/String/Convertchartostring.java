package String;

public class Convertchartostring {
	public static void main(String[] args)
	{
		char[] chars= {'H','E','L','L','O'};
		String result="";
		for(int i=0;i<chars.length;i++)
		{
			result=result+chars[i];
		}
		System.out.println(result);
	}
}
