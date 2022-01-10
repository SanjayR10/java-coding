import java.util.*;
class menuDriven
{
    public void cal()throws Exception
    {
        int a;                               //inputting the user's choice
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter 1 for converting decimal to binary");
        System.out.println("Enter 2 for decimal to octal");
        System.out.println("Enter 3 for decimal to hexadecimal");
        a=scc.nextInt();               
        switch (a)
        {
            case 1:           //To convert decimal to binary
            {
            System.out.println("Enter the decimal number");
            int n=scc.nextInt();
            int arr[]=new int[n+n];
            int i=0;
            while(n>0)
            {
                if(n%2==0)
                {
                    arr[i]=0;
                    ++i;
                }
                else
                {
                    arr[i]=1;
                    ++i;
                }
                n/=2;
            }
            for(int j=i-1;j>=0;j--)
            System.out.print(arr[j]);
            break;
        }
        case 2:                    //To convert decimal to octal
        {
            System.out.println("Enter The Decimal Number");
            int nn=scc.nextInt();
            int aa[]=new int[nn+5];
            int f,i=0;
            while(nn>0)
            {
               f=nn%8;
               aa[i]=f;
               ++i;
               nn/=8;
            }
            for(int m=i-1;m>=0;m--)
            System.out.print(aa[m]);
            break;
        }
        case 3:                 //to convert decimal to hexadecimal
        {
            System.out.println("Enter the decimal number");
            int no=scc.nextInt();
            String aaa="";
            while(no>0)
            {
                int f=no%16;
                if(f<=9)
                aaa=aaa+(int)f;
                else if(f==10)
                aaa=aaa+"A";
                else if(f==11)
                aaa=aaa+"B";
                else if(f==12)
                aaa=aaa+"C";
                else if(f==13)
                aaa=aaa+"D";
                else if(f==14)
                aaa=aaa+"E";
                else
                aaa=aaa+"F";
                no=no/16;
            }
            int k=aaa.length();
            char g;
            for(int kk=k-1;kk>=0;kk--)
            {
                g=aaa.charAt(kk);
                System.out.print(g);
            }
            break;
        }
        default:                //to print error message
        {
        System.out.println("Sorry You Have Entered Wrong Option!!!");
       break;
    }
}
}
}
            
            
        
        
            
            
            
        