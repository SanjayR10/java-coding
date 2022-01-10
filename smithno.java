import java.util.*;
class smithno
{
    public void cal()
    {
        int n,nn,s=0,s1=0;
        Scanner Sc=new Scanner(System.in);    //inputting the value
        System.out.println("Enter the Number");
        n=Sc.nextInt();
        nn=n;
        while(nn>0)                 //Sum of digits
        {
            int a=nn%10;
            s=s+a;
            nn/=10;
        }
        System.out.println("The Sum of digits is "+s);
        nn=n;
            for(int i=2;i<=nn;i++)       //Sum of prime factors
            {
                if(nn%i==0)
                {
                    int j=i;
                    nn=nn/i;
                    i=2;
                    if(j<10)
                    s1=s1+j;
                    else
                    {
                        while(j>0)
                        {
                            int q=j%10;
                            s1=s1+q;
                            j=j/10;
                        }
                    }
                }
            }
        System.out.println("The sum of prime factors "+s1);
        if(s==s1)
        System.out.println("It is an smith number");
        else
        System.out.println("It is not an smith number");
    }
}
                
            