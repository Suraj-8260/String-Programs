package String;

public class Foundtheword {
	public static void main(String[] args)
	{
		String str="I hate java programming";
		String searchword="programming";
		if(str.contains(searchword))
		{
			System.out.println("word is found");
		}
		else
		{
			System.out.println("word is not found");
		}
	}
}
