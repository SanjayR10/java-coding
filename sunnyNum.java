import java.util.Scanner;

public class sunnyNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n+1;
        double sq=Math.sqrt(n1);
        if((sq-(int)Math.floor(sq))==0)
        System.out.println("Sunny number");
        else
        System.out.println("Not Sunny");
    }
}
