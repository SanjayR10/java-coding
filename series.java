import java.util.*;
class series
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of M");
        System.out.println("Enter the value of n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        for(int i=m;i<n;i++)
        {
            if(isprime(i)==true&&ispalindrome(i)==true)
            {
            ++c;
            System.out.print(i+"\t");
        }
    }
        System.out.println("the frequency is "+c);
    
}
    boolean isprime(int x)
    {
        int cc=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            ++cc;
        }
        if(cc==0)
        return true;
        else 
        return false;
    }
    boolean ispalindrome(int h)
    {
        int hh=h;
       int rev=0;
       int gig;
        while(h>0)
        {
            gig=h%10;
            rev=rev*10+gig;
            h/=10;
        }
        if(rev==hh)
        return true;
        else 
        return false;
    }
}
    
           