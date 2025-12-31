import java.util.Scanner;
class Exe1
{   public static void main(String[] arg)
	{    System.out.println("Enter the age: ");
	     Scanner myObj = new Scanner(System.in);
	     int age = myObj.nextInt();
	     if(age>=18)
	    	 System.out.println("You are Eligible to Vote");
	     else
	    	 System.out.println("You are Not Eligible to Vote");
	}
}
