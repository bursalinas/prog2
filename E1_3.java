import static java.lang.System.*;
import java.util.Scanner;
public class E1_3
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int n;
		while(true)
		{
			out.print("Introduza um numero: ");
			n = sc.nextInt();
			if(n > 0)
				break;
			err.println("ERROR: invalid number!");
		}
		String verb = isPrime(n)? "is" : "is not";
		out.printf("Number %d %s prime\n", n, verb);
	}
	public static boolean isPrime(int n)
	{
		int counter = 0;
		for(int i = 1; i <= n; i++)
		{
			if(n%i == 0)
				counter++;
		}
			if(counter == 2)
				return true;
			else
				return false;
	}
}
