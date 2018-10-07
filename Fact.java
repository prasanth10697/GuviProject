import java.util.*;
public class Fact
{
	public static void main(String args[])
	{
		int fact=1;
		Scanner scnr=new Scanner(System.in);
		int n=scnr.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}