import java.util.*;
class ret
{
    int a,ep;
    ret()
    {
        ep=0;
        a=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ending value");
        ep=sc.nextInt();
    }
    void show()
    {
        System.out.println("The fibanocii series is:");
        System.out.println("0");
            System.out.println("1");
        isfib(a);
        System.out.println(a);
        
    }
        int isfib(int a)
        {
            int f1=0,f2=1,f3;
            
            for(int j=0;j<ep-1;j++)
            {
                f3=f2+f1;
                a=a+f3;
            f1=f2;
            f2=f3;
       return a;
    }
    
}
public static void main(String args[])
{
    ret obj=new ret();
    obj.input();
    obj.show();
    obj.isfib();
}
}

            