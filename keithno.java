import java.util.*;
class keithno
{
    public void cal()
    {
        int n,nn,c=0,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        n=sc.nextInt();          //To Get The Value
        nn=n;
        int arr[]=new int[n];
        while(nn>0)             //to count the no of digits
        {
            ++c;
            nn/=10;
        }
        nn=n;
        
        for(int j=c-1;j>=0;j--)   //to store the digits in array
        {
            arr[j]=nn%10;
            nn/=10;
        }
        for(int i=0;i<=n;i++)    
        {
            for(int f=i;f<c;f++)
            {
                s=s+arr[f];            //To Check for Keith Number
            }
            arr[c]=s;
            if(s>=n)
            break;
            s=0;
            ++c;
            
        }
        if(s==n)
        System.out.println(n+" is an Keith Number");
        else
        System.out.println(n+" is not an Keith Number");
    }
}
