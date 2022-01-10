import java.util.*;
class bubble
{
    public void cal()
    {
        int t;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>(a[j+1]))
                {
                   t=a[j];
                  a[j]=a[j+1];
                  a[j+1]=t;
                }
            }
        }
        System.out.println("The Arranged manner is ");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
        
        
        
        