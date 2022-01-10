import java.util.*;
class san
{
    public static void printt(String ss,int nn)
    {
        int l=ss.length();String ne="";
        for(int i=0;i<l;i++)
        {
        ne=ss.substring(i,nn+1);
        }
        System.out.print(ne);
    }
    
    
    
    
    
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        printt(s,n);
    }
}