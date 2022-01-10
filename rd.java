import java.util.*;
class rd
{
    public void cal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int r=sc.nextInt();
        System.out.println("Enter the column");
        int c=sc.nextInt();
        System.out.println("Enter the elements of first matrix");
        int a[][]=new int[r][c];
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The orginal matrix:");
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    
    System.out.println("The diagnal element are:");
    int i,j;
    for(i=0, j=c-1;i<r;i++,j--)
    {
        
    
           
                System.out.print(a[i][j]+"\t");
            
        }
           
    }
}
    