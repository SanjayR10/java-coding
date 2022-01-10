import java.util.Scanner;

public class autobographNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,c=0;
        while(n>0){
            ++c;
            sum=sum+(n%10);
            n/=10;
        }
        if(c==sum)
        System.out.println("Yes");
        else
        System.out.println("Yes");
    }
}
