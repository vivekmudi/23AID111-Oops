import java.util.Scanner;
class Exe4
{   public static void main(String[] arg)
	{   System.out.println("Enter the Year: ");
	    Scanner myObj = new Scanner(System.in);
	    int Year = myObj.nextInt();
	    if(Year%4==0)
	    	System.out.printf("%d is Leap Year",Year); // Formatted Specified Method
	    else 
	    	System.out.println(Year+" is Not a Leap Year");  // Strings Method
	}

} 
 
