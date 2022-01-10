import java.util.*;
class bit
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();int ii=0;
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0;i<n;i++)
    { 
      a[i]=sc.nextInt();
    }
    int s=11,l=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==0||a[i]<10)
      {
        s=0;
        l=0;
        continue;
      }
      else
      {
        while(a[i]>0)
        {
           int digit=a[i]%10;
          if(digit>l)
            l=digit;
          if(digit<s)
            s=digit;
          a[i]=a[i]/10;
        }
      }
      
      int sum=l*11+s*7;
      if(sum>99){
        b[ii]=sum%100;++ii;}
      else{
        b[ii]=sum;++ii;}
        s=11;l=0;
        
    }int count=0;
    for(int i=0;i<ii;i++)
      {
          if(i%2==0)
          {
              int tem=b[i]/10;
              for(int j=i+2;j<ii;j++)
              {int temm=b[j]/10;
                  if(tem==temm)
                  ++count;
                }
            }
            else
            {
                int temmm=b[i]/10;
                for(int j=i+2;j<ii;j++)
                {
                    int temmmm=b[j]/10;
                    if(temmm==temmmm)
                    ++count;
                }
            }
  }
  System.out.println(count);
}   
}     
        
             
          
      