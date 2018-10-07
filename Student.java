import java.util.Scanner;
 
public class Student
{
      public static void main(String args[])
      {
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          String name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          int roll=SC.nextInt();
          System.out.print("Enter the year: ");
         int  yr=SC.nextInt();
           
          System.out.println("Enter The Details:\n" + roll +name +yr);
         
            
      }
          
}