// Nth Fibonacci Number
// Send Feedback
// Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//     F(n) = F(n-1) + F(n-2), 
//     Where, F(1) =  1, 
//            F(2) = 1
// Provided N you have to find out the Nth Fibonacci Number.
// Input Format :
// The first line of each test case contains a real number ‘N’.
// Output Format :
// For each test case, return its equivalent Fibonacci number.
// Constraints:
// 1 <= N <= 10000     
// Where ‘N’ represents the number for which we have to find its equivalent Fibonacci number.

// Time Limit: 1 second
// Sample Input 1:
// 6
// Sample Output 1:
// 8
// Explanation
// Now the number is ‘6’ so we have to find the “6th” Fibonacci number
// So by using the property of the Fibonacci series i.e 

// [ 1, 1, 2, 3, 5, 8, 13, 21]
// So the “6th” element is “8” hence we get the output.

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int F1=1;
        int F2=1;
        for(int i=1;i<=n-2;i++)
        {
           int temp=F1;
             F1=F2;
             F2=F2+temp;
        }
        System.out.println(F2);

		
	}

}
