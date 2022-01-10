import java.util.Scanner;

public class twodpattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++k +" ");
            }
            k=0;
            for(int j=n;j>i;j--)
            System.out.print("    ");
            for(int j=1;j<=i;j++){
            System.out.print(c+" ");
            }
            c=c+1;
            System.out.println();

        }
    }
}