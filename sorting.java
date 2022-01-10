import java.util.*;
class sorting
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int m=sc.nextInt();
        int a[][]=new int[m][m];
        System.out.println("Enter the element");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("the orginal matrix is ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int n=(m-2)*(m-2);
        int arr[]=new int [n];
        int f=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i!=0&&j!=0&&j!=m-1&&i!=m-1)
                {
                arr[f]=a[i][j];
                ++f;
            }
               
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]);
        int tmp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[i]<arr[j])
                 {
                     tmp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=tmp;
                    }
                    }
                }
                for(int i=0;i<n;i++)
                System.out.println(arr[i]);
                int l=0;
                for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i!=0&&j!=0&&j!=m-1&&i!=m-1)
                {
                a[i][j]=arr[l];
                ++l;
            }
        }
    }
    System.out.println("the shorted matrix is ");
           for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
