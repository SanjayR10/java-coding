import java.util.Scanner;
class Pattern5
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<=n;i++){
           a=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
          

            System.out.println();
        }
    }
}