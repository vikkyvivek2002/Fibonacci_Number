import java.util.Scanner;
public class Fibonacci_Number
{

	public static void main(String[] args)
	{
	    System.out.println("enter a number");
	    Scanner s = new Scanner(System.in);
	   int n = s.nextInt();
	   int a=0, b = 1; 
	   int sum =a+b;
	   
	     
	    for(int i=3;i<=n;i++)
	    {
	         sum = a +b;
	        a = b;
	        b = sum;
	    }
	    System.out.println(sum);
	}

}
