
import java.util.LinkedList;
import java.util.Scanner;

public class InsertionSortUsingLinkedList 
{
	public void insertionSort(LinkedList<Integer> linkedarray)
	{
		int len = linkedarray.size();  
        for(int i=1; i < len; ++i)
        {  
        	int key = linkedarray.get(i);
        	int j = i - 1;
        	
        	while(j >= 0 && linkedarray.get(j) > key)
        	{
        		linkedarray.set(j+1, linkedarray.get(j));
        		j = j-1;
        	}
        	linkedarray.set(j+1, key);
        }       
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to enter :");
		int size = sc.nextInt();
		
		LinkedList<Integer> linkedarray = new LinkedList<Integer>();
		
		System.out.println("Enter the elements for sorting");
		for(int i=1; i<=size; i++)
		{
			linkedarray.add(sc.nextInt());
		}
		
		System.out.println("====Elements Before sorting====");
		System.out.println(linkedarray);
		
		
		InsertionSortUsingLinkedList insertion = new InsertionSortUsingLinkedList();
		insertion.insertionSort(linkedarray);
		
		System.out.println("====Elements After sorting====");
		System.out.println(linkedarray);
		
		sc.close();
	}
}
