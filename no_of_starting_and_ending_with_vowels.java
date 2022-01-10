import java.util.*;
class no_of_starting_and_ending_with_vowels
{
    public void main()throws Exception
    {
     String s,nw="";
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String");
     s=sc.nextLine();
     s=s.trim();
     s=s+" ";
     s=s.toLowerCase();
     int j=0,c=0,op=0;
     char ch;
     for(int i=0;i<s.length();i++)
     {
         ch=s.charAt(i);
         if(ch==' ')
         {
             nw=s.substring(j,i);
             char chs=' ';
             char chl=nw.charAt(nw.length()-1);
   for(int y=0;y<nw.length();y++)
   {
       if(y==0)
       chs=nw.charAt(y);
    }
    if(is(chs,chl))
             ++c;
             nw="";
             j=i+1;
            }
           
        }
    System.out.println(c);
}
boolean is(char chss,char chll)
{
    
    if((chss=='a'||chss=='e'||chss=='i'||chss=='o'||chss=='u')&&(chll=='a'||chll=='e'||chll=='o'||chll=='u'||chll=='i'))
    return true;
    else
    return false;
}
}
            
     
     
     