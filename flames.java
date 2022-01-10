import java.util.*;
class flames
{
    public void cal()
    {
        String a,b,aa="",bb="",aaa="",bbb="";
        int al,bl;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        a=sc.nextLine();
        al=a.length();
        System.out.println("Enter your crush name");
        b=sc.nextLine();
        bl=b.length();
        for(int j=0;j<al;j++)
        {
            char a1=a.charAt(j);
            if(a1==' ')
            aa=aa+"";
            else
            aa=aa+a1;
        }
        for(int j=0;j<bl;j++)
        {
            char b1=b.charAt(j);
            if(b1==' ')
            bb=bb+"";
            else
            bb=bb+b1;
        }
        al=aa.length();
        bl=bb.length();
        int lm=Math.max(al,bl);
        int lw=Math.min(al,bl);
        
        if(lm==aa.length())
        {
        aaa=aa;
        bbb=bb;
    }
        else if(lm==bb.length())
        {
        aaa=bb;
        bbb=aa;
    }
    int count =0,total=aa.length()+bb.length();
    for(int jj=0;jj<lm;jj++)
    {
        
        char big=aaa.charAt(jj);
        for(int vv=0;vv<lw;vv++)
        {
          
            char smll=bbb.charAt(vv);
            
            if(big==smll)
            { ++count;
                aaa=aaa.replace(aaa.charAt(jj),'0');
                bbb=bbb.replace(bbb.charAt(vv),'9');
                jj=0;
                vv=0;
            }
        }
    }
    total=total-(count*2);
    System.out.println(total);
 
    
    }
}
    
        
    
    
        
        