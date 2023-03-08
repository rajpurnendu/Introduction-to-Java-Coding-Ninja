// Fibonacci Number
// Send Feedback
// Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
// Fibonacci Series is defined by the recurrence
//     F(n) = F(n-1) + F(n-2)
// where F(0) = 0 and F(1) = 1


// Input Format :
// Integer N
// Output Format :
// true or false
// Constraints :
// 0 <= n <= 10^4
// Sample Input 1 :
// 5
// Sample Output 1 :
// true
// Sample Input 2 :
// 14
// Sample Output 2 :
// false    


public class Solution {
	
	public static boolean checkMember(int n){
        int f0=0;
        int f1=1;
        int f3=0;
        while(f3<n)
        {
            f3=f0+f1;
            f0=f1;
            f1=f3;
        }
        if(f3==n)
        {
            return true;
        }
        else
        {
            return false;
        }
	}
	

}
