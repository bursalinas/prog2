import java.util.Scanner;
import java.io.*;
public class E1_7
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		String texto = "";
		try
		{
			File obj = new File(args[0]);
			Scanner myReader = new Scanner(obj);
			while(myReader.hasNextLine())
				texto += myReader.nextLine()+"\n";
			myReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		try
		{
			FileWriter myWriter = new FileWriter(args[1]);
			myWriter.write(texto);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		}
		catch(IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
