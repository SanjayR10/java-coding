import java.util.*;
class keithseries
{
    public void cal()
    {
        int r,r1,c=0,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range");
        r=sc.nextInt();
        System.out.println("Enter the ending range");
        r1=sc.nextInt();
        for(int h=r;h<=r1;h++)
        {
            int a[]=new int[h];
            int hh=h;
            while(hh>0)
            {
                ++c;
                hh/=10;
            }
            hh=h;
            for(int m=c-1;m>=0;m--)
            {
                a[m]=hh%10;
                hh/=10;
            }
            for(int b=0;b<=h;b++)
            {
                for(int f=b;f<c;f++)
                {
                    s=s+a[f];
                }
                a[c]=s;
                if(s>=h)
                break;
                s=0;
                ++c;
            }
            if(s==h)
            System.out.println(h);
        s=0;
        c=0;
    }
}
}
                
                
            
            
                
        
    