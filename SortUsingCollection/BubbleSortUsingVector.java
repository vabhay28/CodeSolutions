
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class BubbleSortUsingVector 
{
	public void bubbleSortVector(Vector<Integer> vector)
	{
		int len = vector.size();  
        for(int i=0; i < len; i++)
        {  
        	for(int j = 1; j <(len-i); j++)
        	{
        		if(vector.get(j-1) > vector.get(j))
        		{
        			Collections.swap(vector, j-1, j);
        		}
        	}
        }   
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements to enter :");
		int size = sc.nextInt();
		
		Vector<Integer> vector = new Vector<Integer>();
		System.out.println("enter the elements :");
		for(int i = 1; i <= size; i++)
		{
			vector.addElement(sc.nextInt());
		}
		
		System.out.println("====Vector Before Sorting====");
		System.out.println(vector);
		
		BubbleSortUsingVector bsv = new BubbleSortUsingVector();
		bsv.bubbleSortVector(vector);
		
		System.out.println("====Vector After Sorting====");
		System.out.println(vector);
		
		sc.close();
	}
}
