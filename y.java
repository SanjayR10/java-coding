import java.util.*;
class y
{
    public void cal()throws Exception
    {
        String s,wd="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        s=sc.nextLine();
        s=s.toLowerCase();
       s=s.trim();
       s=s+" ";
       int i=0;
       for(int j=0;j<s.length();j++)
       {
           char ch=s.charAt(j);
           if(ch==' ')
           {
               String h=s.substring(i,j);
              wd=h+" "+wd;
               
               h="";
           
            i=j+1;
            }
        }
        System.out.println(wd);
    }
}
               
       