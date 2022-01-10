import java.util.Scanner;

public class pattern18 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=(n*(n+1))/2;
        int ch=65+k;
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++)
            System.out.print("  ");
            for(int j=i;j<=n;j++)
            System.out.print((char)--ch+" ");

            System.out.println();
        }
    }
}
