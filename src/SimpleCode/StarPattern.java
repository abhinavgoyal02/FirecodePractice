/**
 * 
 */
package SimpleCode;

import java.util.Scanner;

/**
 * @author _goyala2
 *
 */
public class StarPattern {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number star pattern lines: ");
		int n=sc.nextInt();
		sc.close();
		
		
		// Left-Star Pattern
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
//		System.out.println("Left-Star Pattern:");
//		for (int i = 0; i <= n; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// Left-Star Pattern (Flip down-side)
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
//		System.out.println("\nLeft-Star Pattern (Flip down-side):");
//		for (int i = 0; i <= n; i++) {
//			for (int j = n; j > i; j--) {
//			System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// Right-Star Pattern
		//			*
		//	      * * 
		//	    * * * 
		//	  * * * * 
		//	* * * * *
//		System.out.println("Right-Star Pattern:");
//		for (int i = 1; i <= n; i++) {			
//			for (int s=n*2; s > i*2; s--) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 0; j < i; j++) {	
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// Right-Star Pattern (Flip down-side)
		//	* * * * *
		//	  * * * * 
		//	    * * * 
		//	      * * 
		//			*
//		System.out.println("\nRight-Star Pattern (Flip down-side):");
//		for (int i = 0; i <= n; i++) {										
//			for (int s=i*2; s > n*2; s++) {
//				System.out.print(" ");
//			}
//			
//			for (int j = n; j > i; j--) {	
//				System.out.print("* ");
//			}			
//			System.out.println();
//		}
		
		// Pyramid-Star Pattern
				//			*
				//	      * * 
				//	    * * * 
				//	  * * * * 
				//	* * * * *

		for (int i = 1; i <= 5; i++) {
			System.out.println();
			
			for (int s=5; s > i; s--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("* ");
			}
		}
		
	}

}
