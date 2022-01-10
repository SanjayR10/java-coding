import java.util.*;
class circularprime
{
    public void cal()
    {
        int n,nn,c=0,a1,b,v,h=0;
        Scanner sc=new Scanner(System.in);      //inputting the value
        System.out.println("Enter the Number"); 
        n=sc.nextInt();              
        nn=n;
        while(nn>0)       //checking no.of digits
        {
            ++c;
            nn/=10;
        }
        nn=n;
        int a[]=new int[n];
        for(int i=0;i<c;i++)     //combinations of number
        {
            a1=nn%((int)Math.pow(10,c-1));
            b=nn/((int)Math.pow(10,c-1));
            v=a1*10+b;
            System.out.println(v);
            a[i]=v;
            nn=v;
        }
        for(int j=0;j<c;j++)        //checking for cicularprime
        {
            for(int g=1;g<a[j];g++)
            {
                if(a[j]%g==0)
                ++h;
            }
        }
        if(h==c)
        System.out.println("It is an circular prime");
        else
        System.out.println("Not an circular prime");
    }
}
               
        
            
            
 