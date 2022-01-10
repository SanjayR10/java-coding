import java.util.*;
class nonrep_
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j]&&i!=j)
                ++c;
            }
            if(c==1)
            System.out.print(a[i] + " ");
            c=0;
    }
}
}
        
                
        
        
        