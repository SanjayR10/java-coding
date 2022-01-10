import java.util.*;
class add
{
    public void cal()
    {
        int sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int r=sc.nextInt();
        System.out.println("Enter the column");
        int c=sc.nextInt();
        System.out.println("Enter the elements of first matrix");
        int a[][]=new int[r][c];
        int aa[][]=new int[r][c];
        int a2[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                aa[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               sum=a[i][j]+aa[i][j];
               a2[i][j]=sum;
               sum=0;
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
        
        