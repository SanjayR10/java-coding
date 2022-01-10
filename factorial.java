import java.util.*;
class factorial
{
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int c=sc.nextInt();
        System.out.println("the factorial is "+inputt(c));
    }
    int inputt(int b)
    
   {
     
       if(b==1)
       
       return 1;
       
       
       else
       {
         
          return (b*inputt(b-1));
        }
    }
}