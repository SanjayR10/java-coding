import java.util.*;
class fib
{int a=0,b=1;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int c=sc.nextInt();
        System.out.println("Enter the number");
        int d=sc.nextInt();
        System.out.println("Enter the number");
        int e=sc.nextInt();
        System.out.println(inputt(c,d,e));
        
    }
     int inputt(int a,int b,int g)
    {
        if(g<=0)
        {
        System.out.println(a+b);
    }
        System.out.println(a);
        return inputt(b,(a+b),g-1);
    }
}
        
        