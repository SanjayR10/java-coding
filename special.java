import java.util.*;
class special
{
    public void cal()
    {
        String a;
        char s,e;
        int d=-1,c=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");   //getting the string
        a=sc.nextLine();
        a=a.toUpperCase();
        a=a.trim();
        s=a.charAt(0);
        e=a.charAt(a.length()-1);
        if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U')  //to increase the counter if vowel
        ++d;
        if(e=='A'||e=='E'||e=='I'||e=='O'||e=='U')
        ++d;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);   //checking for super special word
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                ++c;
                ++k;
            }
        }
        if(c==3&&d==1)
        System.out.println("It is an Super special word");
        else if(c==3||d==1||k==1)
        System.out.println("It is an special word");
        else
        System.out.println("Not an special word");
    }
}
            
        
        
        
           