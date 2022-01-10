import java.util.*;
class palindrome
{int d,r=0; 
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f=sc.nextInt();
        if(method(f)==f)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
    }
    int method(int j)
    {
        if(j>0)
        {
            d=j%10;
            r=r*10+d;
            return (method(j/10));
        }
        return r;
    }
    
}
            
            
        
      