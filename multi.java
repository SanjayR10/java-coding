import java.util.*;
class multi
{
    public void cal()
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int r=sc.nextInt();
        System.out.println("Enter the column");
        int c=sc.nextInt();
        System.out.println("Enter the elements of first matrix");
        int a[][]=new int[r][r];
        int aa[][]=new int[r][r];
        int a2[][]=new int[r][r];
         for(int i=0;i<r;i++)               //getting the value of first matrix
        {
            for(int j=0;j<r;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second array");
        for(int i=0;i<r;i++)                  //getting the value of first matrix
        {
            for(int j=0;j<r;j++)
            {
                aa[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)                    //multiplying two matrix
        {
            for(int j=0;j<r;j++)
            {
                for(int m=0;m<c;m++)
                {
                    sum=sum+a[i][m]*aa[m][j];
                
                }
                 a2[i][j]=sum;
                 sum=0;
            }
        }
        System.out.println("The multiplied matrix is");
         for(int i=0;i<r;i++)                 //printing the matrix
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
        
               
        