import java.util.*;
class fre
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
        int count=0,c=0,tem=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                continue;
                else
                {
                    if(a[i]==a[j])
                    c++;
                }
            }
            if(c>count)
            {
                count=c;
                tem=a[i];
            }
            c=0;
        }
        if(count>0)
        System.out.println(tem);
        else
        System.out.println("no such elements");
    }
}
        
                
        
        
        