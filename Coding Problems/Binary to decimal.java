// Binary to decimal
// Send Feedback
// Given a binary number as an integer N, convert it into decimal and print.
// Input format :
// An integer N in the Binary Format
// Output format :
// Corresponding Decimal number (as integer)
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n;
        n=sc.nextInt();
        int num=0;
        int i=0;
        while(n!=0)
        {
            int digit=n%10;
            int powerofTwo=(int)Math.pow(2,i);
            num=num+digit*powerofTwo;
            i++;
            n=n/10;
        }
        System.out.println(num);

	}
}
