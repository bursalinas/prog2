import static java.lang.System.*;
import java.util.Scanner;
public class E1_2
{
	public static Scanner sc;
	public static final double NOTA_MINIMA = 6.5;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		double atp1 = readInRange("ATP1? ", 0.0, 20.0);
		double ap1 = readInRange("AP1? ", 0.0, 20.0);
		double atp2 = readInRange("ATP2? ", 0.0, 20.0);
		double ap2 = readInRange("AP2? ", 0.0, 20.0);
		double ctp = atp1/2 + atp2/2;
		double cp = 2*ap1/7 + 5*ap2/7;
		int nf;
		boolean aprovado;
		if(ctp < 6.5 || cp < 6.5)
			nf = -66;
		else 
			nf = (int) Math.round(0.3*ctp + 0.7*cp);
		aprovado = nf >= 9.5;
		out.printf(" %7s %7s %7s %7s\n", "CTP", "CP", "NF", "APROV?");
        out.printf(" %7.1f %7.1f %7d %7s\n", ctp, cp, nf, aprovado);
	}
	public static double readInRange(String prompt, double min, double max)
	{
		assert min <= max : "max must be at least as large as min!";
		double value;
		while(true)
		{
		out.print(prompt);
		value = sc.nextDouble();
		if(value < min || value > max)
			out.println("Nota invalida!");
		else
			break;
		}
		return value;
	}
}
