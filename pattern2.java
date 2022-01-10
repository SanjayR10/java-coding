import java.util.Scanner;

class Pattern2
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int 
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            System.out.print(j+" ");

            System.out.println();
        }
    }
}