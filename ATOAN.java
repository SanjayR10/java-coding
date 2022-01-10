import java.util.*;
class ATOAN
{
    public void cal()
    {String n2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String n=sc.nextLine();
        n=" "+n+" ";
        int l=n.length();
        for(int j=0;j<l-2;j++)
        {
            
        char c1=n.charAt(j);
        char c2=n.charAt(j+1);
        char c3=n.charAt(j+2);
        if(c1==' '&&c2=='a'&&c3==' ')
        {
            n2=n2+"an";
            j=j+2;
        }
        else
        n2=n2+c1;
    }
    System.out.println(n2);
}
}
         