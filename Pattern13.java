/* Program for pattern 
 * 54321
 * 5432
 * 543
 * 54
 * 5*/

public class Pattern13
{
	public static void main(String[] args) {
	     
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}