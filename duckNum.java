import java.util.Scanner;

public class duckNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ns=0;
        int c=(int)Math.log10(n)+1;
        System.out.println(c);
        while(n>0){
          if(n%10==0)
          {
              ++ns;
              System.out.println("duck");
              break;
            }
            n/=10;
        }
        if(ns==0)
        System.out.println("not duck");
    }
}
