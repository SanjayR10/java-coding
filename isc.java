import java.util.*;
class isc
{
    String s,nw="";
    isc()
    {
        s="";
    }
    isc(String ss)
    {
        s=ss;
    }
    void show()
    {
        if(isvalid())
        {
        System.out.println("Valid and Before modified :"+s);
        modified();
        System.out.println("after modified :"+nw);
    }
       else
       System.out.println("Invalid");
    }
    boolean isvalid()
    {
        int k=0;
        s=s.trim();
        int l=s.length();
        for(int g=0;g<l;g++)
        {
            char ch=s.charAt(g);
            if(ch>=97&&ch<=123||ch==' ')
            ++k;
            
        }
        if(k==l)
            return true;
            else 
            return false;
    }
    String modified()
    {
        int ll=s.length()-1;
        
        for(int j=0;j<s.length()-1;j++)
        {
            char c=s.charAt(j);
            if(c!=s.charAt(j+1))
            {
            nw=nw+c;
        }
        }
        nw=nw+s.charAt(ll);
        
        return nw;
    }
    public void main()
    {
        isc obj=new isc();
        isc ob=new isc("iam a footballer");
        
        ob.show();
        ob.isvalid();
        ob.modified();
    }
}
        
            
        
        