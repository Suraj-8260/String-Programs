package String;

public class Convertstringtochar {
	public static void main(String[] args)
	{
		String str="HELLO";
		char[] chars=str.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			System.out.println(chars[i]);
		}
	}
}
