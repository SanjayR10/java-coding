package college_programs;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimention of the matrix");
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        System.out.println("Enter the element of the matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        int[] m=new int[n+n];
        int sum=0,sum1=0,c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              sum=sum+a[i][j];
              sum1=sum1+a[j][i];
            }
            m[c++]=sum;
            m[c++]=sum1;
            sum=sum1=0;
        }
       Arrays.sort(m);
        System.out.println(m[c-2]+m[c-1]);
    }
}
