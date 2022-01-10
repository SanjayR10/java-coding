import java.util.*;
class sor
{
    public void cal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int r=sc.nextInt();
        System.out.println("Enter the size of the column");
        int c=sc.nextInt(); 
        int ar[][]=new int[r][c];
        System.out.println("Enter the orginal matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
         System.out.println("the orginal matrix is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
        int a[]=new int[c];
        
        int t=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[j]=ar[i][j];
            }
            t=0;
            for(int ii=0;ii<c;ii++)
            {
                for(int jj=0;jj<c-1;jj++)
                {
                    if(a[ii]<a[jj])
                    {
                      t=a[ii];
                      a[ii]=a[jj];
                      a[jj]=t;
                    }
                }
            }
        for(int j=0;j<c;j++)
            {
                ar[i][j]=a[j];
            }
        }
        System.out.println("sorted array is");
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
        