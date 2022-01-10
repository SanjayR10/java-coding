import java.util.*;
class sumofdiagonal
{
    public void main()
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        System.out.println("Enter the elements of matrix");
        int a[][]=new int[r][c];
        int sl=0,sr=0,sb=0;
        for(int i=0;i<r;i++)       //getting the value of matrix
        {
            for(int j=0;j<r;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The orginal matrix is :");
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The left diagonal elements are:");
         for(int i=0;i<r;i++)   //sum of left diagonals
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                {
                    sl=sl+a[i][j];
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("The sum of left diagonal element is="+sl);
        System.out.println("The Right diagonal elemets are:");
        int i,j;
        for(i=0,j=c-1; i<r;i++,j--)    //sum of right diagonals
        {
           System.out.print(a[i][j]+" ");
           sr=sr+a[i][j];
        }
        System.out.println();
        System.out.println("The sum of right diagonal element are="+sr);
        System.out.println("The boundary elements are:");
        for(int m=0;m<r;m++)    //sum of boundary element
        {
            for(int v=0;v<c;v++)
            {
                if(m==0||v==0||m==r-1||v==c-1)  
                {
                System.out.print(a[m][v]+" ");
                sb=sb+a[m][v];
                  }
                }
            }
            System.out.println();
        System.out.println("The sum of boundary element are="+sb);
    }
}
            
            
        
        
        