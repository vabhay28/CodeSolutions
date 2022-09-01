
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BubbleSortUsingArrayList 
{
	public void BubbleSort(ArrayList<Integer> array)
	{
		int len = array.size();  
        for(int i=0; i < len; i++)
        {  
        	for(int j = 1; j <(len-i); j++)
        	{
        		if(array.get(j-1) > array.get(j))
        		{
        			Collections.swap(array, j-1, j);
        		}
        	}
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
		
		
		BubbleSortUsingArrayList bsuc = new BubbleSortUsingArrayList();
		bsuc.BubbleSort(array);
		
		System.out.println("====Elements After sorting====");
		System.out.println(array);
		
		
		sc.close();
	}
}
