import java.util.Scanner;
class Exe9
{   public static void main(String[] arg)
	{   System.out.println("Enter a Number: ");
	    Scanner myObj = new Scanner(System.in);
	    int N = myObj.nextInt();
	    int D,t,rev;
	    t=N;
	    rev=0;
	    while(t>0)
	    {   D=t%10;
	        rev=rev*10+D;
	        t=t/10;
	    }
	    System.out.printf("%d is a reverse of a number %d",rev,N);
	}
}