import java.util.Scanner;
public class E1_1
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.print("Introduza o calculo que deseja efetuar:\n");
		double a = sc.nextDouble();
		String operador = sc.next();
		double b = sc.nextDouble();
		validaroperador(operador);
		if(validaroperador(operador))
			System.out.println("Resultado:" + conta(a, operador, b));
		else
			System.out.println("System.err");
	}
	public static boolean validaroperador(String operador)
	{
		if(operador.equals("+") && operador.equals("-") && operador.equals("*") && operador.equals("/"))
			return true;
		else
			return false;
	}
	public static double conta(double a, String operador, double b)
	{
		if(operador.equals("+"))
			return a+b;
		else if(operador.equals("-"))
			return a-b;
		else if(operador.equals("*"))
			return a*b;
		else 
			return a/b;
	}
}
