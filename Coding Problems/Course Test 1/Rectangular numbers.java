// Rectangular numbers
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 4
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334  
// 4444444
// Input format : N (Total no. of rows)

// Output format : Pattern in N lines

// Sample Input :
// 3
// Sample Output :
// 33333
// 32223
// 32123
// 32223
// 33333

//Rectangular numbers
public class solution {

	public static void print(int n) {
	     int z=2*n-1;
         int[][] arr=new int[z][z];
         int front=0;
        int back=z-1;
        while(n!=0)
        {
            for(int i=front;i<=back;i++)
            {
                for(int j=front;j<=back;j++)
                {
                    if(i==front||i==back||j==front||j==back)
                    {
                        arr[i][j]=n;
                    }
                }
            }
            ++front;
            --back;
            --n;
        }
        for(int i=0;i<z;i++)
        {
            for(int j=0;j<z;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
	}

}
