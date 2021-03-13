import static java.lang.System.*;
import java.util.Scanner;
public class E1_4
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		out.println("Introduza uma frase: ");
		String frase;
		do
		{
			frase = sc.nextLine();
			out.println(formatadados(frase));
		}
		while(!frase.equals(""));
	}
	public static String formatadados(String texto)
	{
		texto = texto.replaceAll("L","U");
		texto = texto.replaceAll("l","u");
		texto = texto.replaceAll("R","");
		texto = texto.replaceAll("r","");
		return texto;
	}
}
