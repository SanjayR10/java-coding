import java.util.*;
class fac
{
    int method(int b)
    {
       int sum=1;
        for(int i=1;i<=b;i++)
        sum=sum*i;
        return sum;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f=sc.nextInt();
        System.out.println("the factorial is "+method(f));
    }
}