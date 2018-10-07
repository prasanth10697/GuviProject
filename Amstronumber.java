import java.util.*;
public class Amstronumber
{
	public static void main(String args[])
	{
		int c,n1,temp=0;
		Scanner scnr=new Scanner(System.in);
		int n=scnr.nextInt();
		int m=scnr.nextInt();
		for(int i=n;i<=m;i++)
		{
			n =i;
			while(n>0)
			{
				n1=n%10;
				temp=temp+(n1*n1*n1);
				n = n/10;
			}
			if(temp==i)
			{
					System.out.println(i);
			}
				temp=0;
		}
		
	}
}