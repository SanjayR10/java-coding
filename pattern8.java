import java.util.Scanner;

class Pattern8
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            // if(i==1||i==n)
            // {
                for(int j=1;j<=n;j++){
                    if(j==1||j==n||i==1||i==n)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
               
            // }
            // else{
            //     for(int j=1;j<=i;j++){
            //         if(j==1||j==i)
            //         System.out.print("*");
            //         else
            //         System.out.print(" ");
            //     }
            // }
            System.out.println();
        }
    }
}
