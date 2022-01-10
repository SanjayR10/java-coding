import java.util.*;
class goldbach
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows ");
        int r=sc.nextInt();
        System.out.println("Enter the columns ");
        int c=sc.nextInt();
        int a[][]=new int [r][c];
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("the orginal matrix is ");
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int k=(r-2)*(r-2);
        int ar[]=new int[k];
        int x=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i!=0&&j!=0&&i!=r-1&&j!=c-1)
                {
                ar[x]=a[i][j];
                x=x+1;
            }
            }
        }
        int temp;
        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<k-1-i;j++)
            {
                while(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        int lm=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i!=0&&j!=0&&i!=r-1&&j!=c-1)
                {
                a[i][j]=ar[lm];
                lm=lm+1;
            }
            }
        }
          System.out.println("the sotred ");
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
        
        
            
       
           