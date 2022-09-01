
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class BubbleSortUsingLinkedList 
{
	public void bubbleSort(LinkedList<Integer> linkedArray)
	{
		int len = linkedArray.size();  
        for(int i=0; i < len; i++)
        {  
        	for(int j = 1; j <(len-i); j++)
        	{
        		if(linkedArray.get(j-1) > linkedArray.get(j))
        		{
        			Collections.swap(linkedArray, j-1, j);
        		}
        	}
        }   
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to enter :");
		int size = sc.nextInt();
		
		LinkedList<Integer> linkedArray = new LinkedList<Integer>();
		
		System.out.println("Enter the elements for sorting");
		for(int i=1; i<=size; i++)
		{
			linkedArray.add(sc.nextInt());
		}
		
		System.out.println("====Elements Before sorting====");
		System.out.println(linkedArray);
		
		
		BubbleSortUsingLinkedList bsll = new BubbleSortUsingLinkedList();
		bsll.bubbleSort(linkedArray);
		
		System.out.println("====Elements After sorting====");
		System.out.println(linkedArray);
		
		sc.close();
	}
}
