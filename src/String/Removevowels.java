package String;

public class Removevowels {
	public static void main(String[] args)
	{
		String str="hello world";
		str=str.toLowerCase();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			{
				result=result+ch;
			}
		}
		System.out.println(result);
	}
}
