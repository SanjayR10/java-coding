import java.util.*;
class lar
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=11,l=0;
        while(n>0)
        {
           int digit=n%10;
          if(digit>l)
            l=digit;
          if(digit<s)
            s=digit;
          n=n/10;
        }
        int sum=(l*11)+(s*7);
        System.out.println(sum );
      }
    }
     
             
          
      