import java.util.Scanner;
public class E1_6
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("ADIVINHE O NUMERO!!");
		int counter = 1;
		int random = (int)(Math.random()*(100+1));
		while(true)
		{
			System.out.printf("Tentativa %d: ", counter);
			int num = sc.nextInt();
			counter++;
			if(num < random) 
				System.out.println("Menor");
			else if(num > random)
				System.out.println("Maior");
			else
			{
				System.out.printf("Acertou!! Apos %d tentativas.", counter-1);
				break;
			}
		}
	}
}
