import java.util.Scanner;

class Pattern3
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a=64;
        for(int i=1;i<=n;i++){
            a=a+i;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)a+" ");
                --a;
            }
           a=a+i;

            System.out.println();
        }
    }
}