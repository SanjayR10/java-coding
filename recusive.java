import java.util.*;
class recusive
{
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f=sc.nextInt();
          System.out.println("Enter the number");
        int g=sc.nextInt();
        method(f,g);
    }
     void method(int b,int h)
    {
        if(b==h)
        {System.out.println(b);
        return ;
    }
        else
        {
            System.out.println(b);
         method(b+1,h);
    }
}
}