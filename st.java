import java.util.*;
class st
{
    public void cal()
    {
        String n,wd="",or="",nen="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        n=sc.nextLine();
        n=n.trim();
        n=n.toUpperCase();
        n=n+" ";
        int j=0;
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(ch==' ')
            {
               wd=n.substring(j,i);
               int l=wd.length();
               for(int k=65;k<=90;k++)
               {
                   for(int m=0;m<l;m++)
                   {
                       char chh=wd.charAt(m);
                       if(chh==((char)k))
                       {
                           or=or+chh;
                        }
                    }
                }
                nen=nen+or+" ";
                or="";
                wd="";
                j=i+1;
            }
        }
        System.out.println(nen);
        }
    }
                
                           
                           
                       
               
           
    
    