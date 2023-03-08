// Largest Row or Column
// Send Feedback
// For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
// Note :
// If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output Format :
// For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
// OR
// If column sum is maximum, then print: "column" <col_index> <col_sum>
// It will be printed in a single line separated by a single space between each piece of information.

// Output for every test case will be printed in a seperate line.
//  Consider :
// If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
// Constraints :
// 1 <= t <= 10^2
// 1 <= N <= 10^3
// 1 <= M <= 10^3
// Time Limit: 1sec


public class Solution {

	public static void findLargest(int mat[][]){
        int columMax=Integer.MIN_VALUE;
        int rowMax=Integer.MIN_VALUE;
        int arr_ridx=0;
        int arr_cidx=0;
		for(int i=0;i<mat.length;i++)
        {
            int rsum=0;
            for(int j=0;j<mat[0].length;j++)
            {
                rsum+=mat[i][j];
            }
            if(rowMax<rsum)
            {
                rowMax=rsum;
                arr_ridx=i;
            }
           
        }
        if(mat.length!=0)
        {
        for(int i=0;i<mat[0].length;i++)
        {
            int csum=0;
            for(int j=0;j<mat.length;j++)
            {
                csum+=mat[j][i];
            }
            if(columMax<csum)
            {
                columMax=csum;
                arr_cidx=i;
            }
           
        }
        }
        if(columMax<=rowMax)
        {
            System.out.print("row"+" "+arr_ridx+" "+rowMax);
        }
        else
        {
            System.out.print("column"+" "+arr_cidx+" "+columMax);
        }
	}

}