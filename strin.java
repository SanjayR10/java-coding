import java.util.*;
class strin
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        s=s.trim();
        s=s.toLowerCase();
        String n,wd
        if(s.charAt(s.length()-1)!='?'||s.charAt(s.length()-1)!='.'||s.charAt(s.length()-1)!='!')
        {
        System.out.println("invalid input");
        System.exit(0);
    }
        for(int i=0;i<s.length()-1;i++)
        {
            char f=s.charAt(i);
            n=n+f;
        }
        n=n.trim();
        int y=0;
        
        for(int i=0;i<n.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                
                