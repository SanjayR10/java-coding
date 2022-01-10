import java.util.*;
class k
{
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f=sc.nextInt();
        System.out.println("Enter the number");
        int j=sc.nextInt();
        method (f,j);
    }
    void method(int k,int l)
    {
        if(k==l)
       System.out.println(k);
        else
        {
            if(l%k==0)
            System.out.println(k);
        }
        method (k,l+1);
    }
}
    
