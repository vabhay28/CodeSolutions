import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSortUsingArrayList 
{
	public void InsertionSort(ArrayList<Integer> array)
	{
		int len = array.size();  
        for(int i=1; i < len; ++i)
        {  
        	int key = array.get(i);
        	int j = i - 1;
        	
        	while(j >= 0 && array.get(j) > key)
        	{
        		array.set(j+1, array.get(j));
        		j = j-1;
        	}
        	array.set(j+1, key);
        }                               
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to enter :");
		int size = sc.nextInt();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Enter the elements for sorting");
		for(int i=1; i<=size; i++)
		{
			array.add(sc.nextInt());
		}
		
		System.out.println("====Elements Before sorting====");
		System.out.println(array);
		
		
		InsertionSortUsingArrayList isual = new InsertionSortUsingArrayList();
		isual.InsertionSort(array);
		
		System.out.println("====Elements After sorting====");
		System.out.println(array);

		
		sc.close();
	}
}
