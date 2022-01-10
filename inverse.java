import java.util.*;
class inverse
{
    public void cal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int r=sc.nextInt();
        System.out.println("Enter the column");
        int c=sc.nextInt();
        System.out.println("Enter the elements of matrix");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
        
       
        