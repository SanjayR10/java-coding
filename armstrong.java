import java.util.*;
class armstrong
{int d;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f=sc.nextInt();
        if(method(f)==f)
        System.out.println("Armstrong");
        else
        System.out.println("not Armstrong");
    }
    int method(int gf)
    {
        if(gf==0)
        return 0;
        else
        {
           d=gf%10;
            return(d*d*d+method(gf/10));
        }
}
}
        
    
    