import java.util.Scanner;
public class E1_5
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		double num;
		double soma = 0;
		int counter = 0;
		System.out.println("Introduza numeros: ");
		while(true)
		{
			num = sc.nextDouble();
			if(num == 0)
				break;
			soma+=num;
			counter++;
		}
		System.out.println("Soma = " + soma);
		if(soma == 0)
		{
			System.out.println("Lista vazia!");
			return;
		}
			System.out.println("Media = " + soma/counter);
	}
}
