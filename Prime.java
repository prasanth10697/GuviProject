import java.util.Scanner;
 
public class Prime
{
   public static void main(String args[])
   {
	   Scanner scnr=new Scanner(System.in);
	   int n=scnr.nextInt();
	   if(n%2==0)
	   {
		   System.out.println("no");
	   }else
	   {
		    System.out.println("yes");
	   }
   }
}