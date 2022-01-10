import java.util.*;
class pronicseries
{
    public void cal()
    {
        int r,r2,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Starting Range");
        r=sc.nextInt();
        System.out.println("Enter The Ending Range");
        r2=sc.nextInt();
        for(int j=r;j<=r2;j++)
        {
           int i=1;
            for(;i<=j;i++)
            {
                if(i*(i+1)==j)
                ++c;
            }
            if(c==1)
            System.out.println(j);
            c=0;
        }
    }
}