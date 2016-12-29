/*import java.util.Scanner;
public class Word
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str =sc.nextLine();
		String a[] = str.split(" ");
		int i=0;
		for (String b:a)
		{
			//System.out.println(b);
			i++;
		}System.out.println("The word counts are: "+i);
	}
}*/

import java.util.StringTokenizer;

public class Word 
{
	public static void main(String []args)
	{
		StringTokenizer st= new StringTokenizer("This is my java program"); 
		
		while (st.hasMoreTokens())
		System.out.println(st.nextToken(" "));
		
	}
}
