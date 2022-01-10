import java.util.*;
class gold 
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n<=9||n>=50)
        {
         System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            System.exit(0);
        }
        if(n%2!=0)
        {
            System.out.println("Odd");
            System.exit(0);
        }
        gold o=new gold();
        System.out.println("prime factors are :");
        o.print(n);
        
    }

  void print(int n)
  {
       int i, j;
        for(i=2;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                //If i and j are both prime and i+j is equal to n then i and j will be printed
                if(isPrime(i)&&isPrime(j)&&i+j==n)
                System.out.println(i+", "+j);
            }
        }
    }
    boolean isPrime(int k)
    {
        if(k<=1)
        return false;
        int v=0;
        v=0;
        for(int m=2;m<k;m++)
        {
            if(k%m==0)
            ++v;
        }
        if(v==0)
        return true;
        else 
        return false;
    }
}

        
        
        
      
    
    
      
        
