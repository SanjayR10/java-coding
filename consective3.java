import java.util.*;
public class consective3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,c,flag=0;
        while(n>100){
            int l=n;
            a=l%10;
            l=l/10;
            b=l%10;
            l=l/10;
            c=l%10;
            if((a-1==b&&a-2==c)||(a+1==b&&a+2==c))
            ++flag;

            n/=10;
        }
    if(flag==0)
    System.out.print("No");
    else
    System.out.print("Yes");
    }    
}
