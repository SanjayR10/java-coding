import java.util.*;
class smallestword
{
    public void cal()throws Exception
    {
        String s,wd="",nwd="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        int k=26,j=0,l;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                wd=s.substring(j,i);
                l=wd.length();
                if(l<k)
                {
                    k=l;
                    nwd=wd;
                    wd="";
                    
                }
               j=i+1;
            }
        }
        System.out.println(nwd);
        }
    }
            
        
