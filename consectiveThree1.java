import java.util.*;
public class consectiveThree1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cp=n;
        int c=0;
        int rev=0;
        while(n>0){
            ++c;
            n/=10;
        }
        n=cp;
        int a[]=new int[c];
        for(int i=c-1;i>=0;i--){
        a[i]=n%10;
        n/=10;
        }
        Arrays.sort(a);
        int count=0;
        int last=a[0];
        int i=0;
        if(last+1!=a[1]){
            last=a[1];
            i=1;
        }
        for(;i<c;i++){
            if(last==a[i]){
            ++count;
            ++last;
            }
        }
        if(count>=3)
        System.out.print("Yes");
        else
        System.out.print("Yes");
    }
}
