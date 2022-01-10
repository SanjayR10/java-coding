import java.util.*;
public class SwappingAdacentdigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int cp=n;
        int rev=0;
        int c=0;
        while(n>0)
        {
            ++c;
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.println(rev+" "+c);
        int temrev=0;int ans=0;
        while(c>0){
            int temp=rev%100;
            if(rev>9)
             ans=ans*100+temp;
             else
             ans=ans*10+temp;
             rev/=100;
             c=c-2;
        }
        System.out.println(ans);
}
}
