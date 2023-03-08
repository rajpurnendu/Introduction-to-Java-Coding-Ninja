// Check AP
// Send Feedback
// Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
// Input format :
// Line 1 : n
// Line 2 : n numbers
// Sample Input 1 :
// 6
// 2 6 10 14 18 22
// Sample Output 1 :
// true
// Sample Input 2 :
// 6
// 2 6 10 15 19 23
// Sample Output 2 :
// false

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        int diff=n2-n1;
        int i=1;
        while(i<=n-2)
        {
            int z=sc.nextInt();
            if((z-n2)!=diff)
            {
                System.out.println(false);
                return;
            }
            n1=n2;
            n2=z;
            i++;
        }
        System.out.println(true);

	}
}
