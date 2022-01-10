import java.util.*;
class number
{
    public void main()
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m");
        m=sc.nextInt();
        if(m<100||m>10000)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        if(n>=100)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
       
        cal(m,n);
    }
    void cal(int mm,int ss)
    {
        int s2=0,c=0,k=0;
        for(int i=mm+1;i<=10000;i++)

        {
            k=i;
            while(i>0)
            {
                ++c;
                s2=s2+(i%10);
                i/=10;
            }
            i=k;
            if(s2==ss)
            break;
            else
            {
            c=0;
            s2=0;
        }
        }
        System.out.println("the number required is"+k);
        System.out.println("the digiots required is "+c);
    }
}
        
        
            
                
        
        
        
        