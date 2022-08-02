import java.util.Scanner;

public class Pattern1{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Pattern :");
		int num = sc.nextInt();
		
		for(int i=0; i<num;i++)
		{
			System.out.print("1 ");
		}
		
		sc.close();
	}
}