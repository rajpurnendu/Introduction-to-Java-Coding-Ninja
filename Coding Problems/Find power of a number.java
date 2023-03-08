// Find power of a number
// Send Feedback
// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
// Note : For this question, you can assume that 0 raised to the power of 0 is 1


// Input format :
// Two integers x and n (separated by space)
// Output Format :
// x^n (i.e. x raise to the power n)
// Constraints:
// 0 <= x <= 8 
// 0 <= n <= 9
// Sample Input 1 :
//  3 4
// Sample Output 1 :
// 81
// Sample Input 2 :
//  2 5
// Sample Output 2 :
// 32

import java.util.Scanner;
public class Solution {
    public static int powerofN(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        if(n%2==0)
        {
            return powerofN(x,n/2)*powerofN(x,n/2);
        }
        else
        {
            return powerofN(x,n/2)*powerofN(x,n/2)*x;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,n;
        x=sc.nextInt();
        n=sc.nextInt();
        int result=powerofN(x,n);
        System.out.println(result);
        
    }
}