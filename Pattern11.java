/* Program for pattern 
 * 5
 * 45
 * 345
 * 2345
 * 12345*/


public class Pattern11
{
  public static void main(String[] args) 
       {
        for (int i = 5; i >= 1; i--) 
          {
            for (int j = i; j <= 5; j++) 
            {
                System.out.print(j + " ");
             }
            System.out.println();
          }

     }
}