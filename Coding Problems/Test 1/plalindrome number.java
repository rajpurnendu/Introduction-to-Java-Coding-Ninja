// Palindrome number
// Send Feedback
// Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
// Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
// Sample Input 1 :
// 121
// Sample Output 1 :
// true
// Sample Input 2 :
// 1032
// Sample Output 2 :
// false

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev_num=0;
        while(n!=0)
        {
            int dig=n%10;
            rev_num=rev_num*10+dig;
            n=n/10;
        }
        if(temp==rev_num)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

	}
}
