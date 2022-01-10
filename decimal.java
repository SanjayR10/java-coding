import java.util.*;
class decimal

{
    public void cal()  
    {   
        int c=0,sum=0;
        Scanner ssc=new Scanner(System.in);
        int n=ssc.nextInt();
        int nn=n;
        while(nn>0)
        {
            ++c;
            nn/=10;
        }
        System.out.println(c);
        int c1=c;
       for(int i=0;i<c1;i++)
       {
           int a=n%10;
           int b=a*((int)Math.pow(2,i));
           sum=sum+b;
           n=n/10;
        }
    System.out.println(sum);
}}
        
        