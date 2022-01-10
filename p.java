import java.util.*;
class p
{
    public void cal()throws Exception
    {
        String s,wd="",w="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        s=sc.nextLine();
        s=s.toLowerCase();
       s=s.trim();
       s=s+" ";
       
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
                if(ch==' ')
                {
                    wd=s.substring(j,i);
                    System.out.print(wd+":");
                    for(int m=wd.length()-1;m>=0;m--)
                    {
                    char chh=wd.charAt(m);
                    w=w+chh;
                    }
                    if(wd.equals(w))
                    {
                    System.out.print("This word is palindorme ");
                }
                    else
                    {
                     System.out.print("This word is not palindorme ");
                    }
                    System.out.println();
                     wd="";
                     w="";
                     j=i+1;
                     }
                    }
                     }
                     }
                    
                    