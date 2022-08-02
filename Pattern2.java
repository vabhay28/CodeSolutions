import java.util.Scanner;

public class Pattern2{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Pattern :");
		int num = sc.nextInt();
		
		for(int i=1; i<=num;i++)
		{
			System.out.print(i+" ");
		}
		
		sc.close();
	}
}