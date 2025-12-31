import java.util.Scanner; // importing the javas Scanner library 
// if u want all types of libraries then replace the Scanner with *
class Ex1  // class name should be same as file name 
{   public static void main(String[] arg)
	{  System.out.print("Enter the marks");  
	   Scanner myObj = new Scanner(System.in); // creating Object file 
	   double marks = myObj.nextDouble();
	   if(marks>50)
		   System.out.print("Pass");
	   else
		   System.out.print("Fail");
	}	
}
