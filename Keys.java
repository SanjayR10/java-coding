import java.util.Scanner;

public class Keys {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=getFirst(n);
        int nn=sc.nextInt();
        int second=getSecond(nn);
        int nnn=sc.nextInt();
        int large=getLarge(nnn);
        System.out.println((first*second)-large);
    }
    public static int getFirst(int n)
    {
        char a=String.valueOf(n).charAt(0);
        String aa=Character.toString(a);
        int i=Integer.parseInt(aa);
        return i;
    }
    public static int getSecond(int n)
    {
        char a=String.valueOf(n).charAt(1);
        String aa=Character.toString(a);
        int i=Integer.parseInt(aa);
        return i;
    }
    public static int getLarge(int n)
    {
        int l=0;
        while(n>0)
        {
            if(n%10>l)
                l=n%10;
            n/=10;
        }
        return l;
    }
}
