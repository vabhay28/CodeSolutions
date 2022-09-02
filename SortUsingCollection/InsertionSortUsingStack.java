import java.util.Scanner;
import java.util.Stack;

public class InsertionSortUsingStack 
{
    public void insertionSortStack(Stack<Integer> stack)
    {
        int len = stack.size();  
        for(int i=1; i < len; ++i)
        {  
        	int key = stack.get(i);
        	int j = i - 1;
        	
        	while(j >= 0 && stack.get(j) > key)
        	{
        		stack.set(j+1, stack.get(j));
        		j = j-1;
        	}
        	stack.set(j+1, key);
        }  
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements to enter :");
		int size = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("enter the elements :");
		for(int i = 1; i <= size; i++)
		{
			stack.add(sc.nextInt());
		}
		
		System.out.println("====Vector Before Sorting====");
		System.out.println(stack);
		
		InsertionSortUsingStack iss = new InsertionSortUsingStack();
		iss.insertionSortStack(stack);
		
		System.out.println("====Vector After Sorting====");
		System.out.println(stack);
		
		sc.close();
    }    
}
