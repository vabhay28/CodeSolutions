
import java.util.Scanner;
import java.util.Vector;

public class InsertionSortUsingVector 
{
	public void insertionSortVector(Vector<Integer> vector)
	{
		int len = vector.size();  
        for(int i=1; i < len; ++i)
        {  
        	int key = vector.get(i);
        	int j = i - 1;
        	
        	while(j >= 0 && vector.get(j) > key)
        	{
        		vector.set(j+1, vector.get(j));
        		j = j-1;
        	}
        	vector.set(j+1, key);
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
		
		InsertionSortUsingVector isv = new InsertionSortUsingVector();
		isv.insertionSortVector(vector);
		
		System.out.println("====Vector After Sorting====");
		System.out.println(vector);
		
		sc.close();
	
	}
}
