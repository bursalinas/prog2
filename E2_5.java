import java.util.Scanner;
public class E2_5
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		Data d1 = new Data();
		Data d2 = new Data(25, 12, 2020);
		while((d2.dia() != d1.dia()) || (d2.mes() != d1.mes()) || (d2.ano() != d1.ano()))
		{
			d2.seguinte();
			System.out.println(d2.extenso());
		}
	}
}
