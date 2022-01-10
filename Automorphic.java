import java.util.Scanner;

public class Automorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int c=(int)Math.log10(n)+1;
        int k=(int)Math.pow(10,c);
        if(sq%k==n)
        System.out.println("Automorphic");
        else
        System.out.println("Not Automorphic");
    }
}
