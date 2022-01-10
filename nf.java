import java.util.*;
class nf
{int d=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f=sc.nextInt();
        System.out.println(method (f));
    }
    int method(int gf)
    {
        if(gf==0)
        return d;
        else
        {
           ++d;
            return method(gf/10);
        }
}
}
        
    
    