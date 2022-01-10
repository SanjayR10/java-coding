import java.util.*;
class words
{
    public void cal()throws Exception
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        int j=0;
        String wd;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                wd=s.substring(j,i);
                System.out.println(wd);
                wd="";
                j=i+1;
            }
       
    }
}
}
            
        