import java.util.*;
class sorti
{
    public void main()
    {
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]<a[j+1])
                {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }
        }
        for(int i=0;i<n;i++)
        {
        System.out.print(a[i]+"\t");
        }
    }
}
            