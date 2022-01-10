
class alternateoddeven
{
    public void cal()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        int nn=n,c=0,d=0;
       
        int a[]=new int[n];
        while(nn>0)
        {
            ++c;
            nn/=10;
        }
        for(int i=c;i>=1;i--)
        {
            a[i]=n%10;
            n/=10;
        }
        for(int j=1;j<=c;j++)
        {
            if(j%2!=0)
            {
                if(a[j]%2!=0)
                ++d;
            }
            else
            {
                if(a[j]%2==0)
                ++d;
            }
        }
        if(d==c)
        System.out.println("yes");
        else 
        System.out.println("np");
    }
}

        
        