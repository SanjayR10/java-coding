import java.util.*;
class pattern
{
    int l;
    public void cal()
    {
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String a=sc.nextLine();
        l=a.length();                 //getting the String
        printt(a,s);
    }
    void printt(String n,int c)      //recursion code 
    {                                 //for printing each words     
        
        for(int i=0;i<=c;i++)
        {
        char ch=n.charAt(i);
        System.out.print(ch+" ");
    }
    System.out.println();
    if(c==(l-1))
    return;
    
    else
    printt(n,c+1);
}
}
    
        
