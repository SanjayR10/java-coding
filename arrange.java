import java.util.*;
class arrange
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        System.out.println("The element of the array:");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
        
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        System.out.println("The sorted element of the array:");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
        
    }
}
        
        