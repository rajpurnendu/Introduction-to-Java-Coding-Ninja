// All Prime Numbers
// Send Feedback
// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
// Print the prime numbers in different lines.
// Input Format :
// Integer N
// Output Format :
// Prime numbers in different lines
// Constraints :
// 1 <= N <= 100
// Sample Input 1:
// 9
// Sample Output 1:
// 2
// 3
// 5
// 7
// Sample Input 2:
// 20
// Sample Output 2:
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19

import java.util.Scanner;
public class Solution {
    public static int checkPrime(int n)
    {
        if(n<=1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else if(n%2==0)
        {
            return 0;
        }
        
        for(int i=3;i<=Math.sqrt(n);i=i+2)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(checkPrime(i)==1)
            {
                System.out.println(i);
            }
        }
        
		
	}
}

