import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class BubbleSortUsingStack {
	
	public void bubbleSortStack(Stack<Integer> stack){
		Integer n = stack.size();
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(stack.get(j)>stack.get(j+1))
					Collections.swap(stack, j, j+1);
			}
		}
	}

	public static void main(String[] args) 
    {		
            Scanner sc = new Scanner(System.in);
		
            System.out.println("Enter the number of elements to enter :");
            int size = sc.nextInt();
            
            Stack<Integer> stack = new Stack<Integer>();
            System.out.println("Enter the elements for sorting");
            for(int i=1; i<=size; i++)
            {
                stack.add(sc.nextInt());
            }
            
            System.out.println("====Elements Before sorting====");
            System.out.println(stack);
            
            
            BubbleSortUsingStack bsus = new BubbleSortUsingStack();
            bsus.bubbleSortStack(stack);
            
            System.out.println("====Elements After sorting====");
            System.out.println(stack);
            
            
            sc.close();	
    }

}

