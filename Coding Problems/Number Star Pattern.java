// Number Star Pattern
// Send Feedback
// Print the following pattern for given number of rows.
// Input format :

// Line 1 : N (Total number of rows)

// Sample Input :
//    5
// Sample Output :
// 1234554321
// 1234**4321
// 123****321
// 12******21
// 1********1

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         for(int i=n; i>=1; i--)
         {
           for(int j=1; j<=i; j++)
           {
               System.out.print(j);
           }
           for(int k=i; k<n; k++)
           {
              System.out.print("**"); 
           }
           for(int m=i; m>=1; m--)
           {
               System.out.print(m);
           }
           System.out.println();
         }      

	}
}
