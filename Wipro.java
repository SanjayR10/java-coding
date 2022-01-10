import java.util.Scanner;

public class Wipro {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=sc.nextInt();
        System.out.println("Enter the element of the first array");
        char[] a=new char[n];
        for(int i=0;i<n;i++)
            a[i]=sc.next().charAt(0);
        System.out.println("Enter the size of second array");
        int nn=sc.nextInt();
        System.out.println("Enter the element of the second array");
        char[] b=new char[n];
        for(int i=0;i<nn;i++)
            b[i]=sc.next().charAt(0);
        char[] c=new char[a.length+b.length]; int pos=0;
        for(char ch:a)
            c[pos++]=ch;
        for(char ch:b)
            c[pos++]=ch;
        String s="";
        for(int i=0;i<c.length;i++) {pos=0;
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j])
                    ++pos;
            }
            if(pos==1) {
                s = s + c[i];
            }
        }int nu=0;
        if(s.equals("")){
            System.out.println("No Output");
             System.exit(0);}
        else {
            for (int i = 0; i < s.length(); i++)
                nu = nu+s.charAt(i);
        }
        int ss=0;
        while(nu>0||ss>9)
        {
           ss=ss+(nu%10);
           nu/=10;
           if(n==0)
           {
               nu=ss;
               ss=0;
           }
        }
System.out.println(ss);
         }
    }

