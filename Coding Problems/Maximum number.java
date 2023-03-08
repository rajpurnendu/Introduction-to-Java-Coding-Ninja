// Maximum number
// Send Feedback
// We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.
// Input Format :
// A 4 digit number
// Output Format :
// A 3 digit number
// Sample Input :
// 5438
// Sample Output :
// 548
// Explanation :
// 1. If we remove 5, the new number is 438.
// 2. If we remove 4, the new number is 538.
// 3. If we remove 3, the new number is 548.
// 4. If we remove 8, the new number is 543.
// Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548

public class Solution {
    
    public static int max_number(int n){
        int f1=(n/10);
        int f2=(n/100)*10+(n%10);
        int f3=(n/1000)*100+(n%100);
        int f4=(n/10000)*1000+(n%1000);
        int max=Math.max(f1,f2);
           max=Math.max(max,f3);
           max=Math.max(max,f4);
        return max;

    }
    

}
