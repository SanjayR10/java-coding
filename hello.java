import java.util.*;
class hello
{
    public void cal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String n=sc.nextLine();
        n=n.trim();
        
        int f=1;
        String ne="";
        for(int i=0;i<n.length();i++)
        {
            char c=n.charAt(i);
            for(int j=i+1;j<n.length()-1;j++)
            {
           char ch=n.charAt(i);
           if(c==ch)
           {
           ++f;}
        }
        System.out.print(c);
        System.out.print(f);
        f=1;
        
    }
}
}
            
            
        
        
        
        
  