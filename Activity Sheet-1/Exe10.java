import java.util.Scanner;
class Exe10
{   public static void main(String[] arg)
	{   System.out.println("Enter a number: ");
	    Scanner myObj = new Scanner(System.in);
	    int N = myObj.nextInt();
	    int t,D,rev;
	    t=N; rev=0;
	    while(t>0)
	    {    D=t%10;
	         rev=rev*10+D;
	         t=t/10;
	    }
	    if(rev==N)
	    	System.out.println("Given Number is a Palindrome");
	    else 
	    	System.out.println("Given Number is Not a Palindrome");
	}
}