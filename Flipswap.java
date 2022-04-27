import java.util.*;
class Flipswap
{
	public static void main(String[] args)
	{		
		Scanner sc= new Scanner(System.in);
	
		int N = sc.nextInt();		
		String S = sc.next();
		int output = 0;
 
		for(int i=0; i<N; i++)
		{
			if(N<=1)
			{
                break;
			}
			else
			{   
			    if(i+1 == S.length())
			    {
				break;
			    }
				if(S.charAt(i) == S.charAt(i+1))
				{
                    break;
				}
				
				else
				{
				    output++;
				}
			    
			}
			
		} 	
		System.out.println(output);
	}
}