import java.util.Scanner;

class Pattern1
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int in=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(in+++" ");
            }
            System.out.println();
        }
        int ans=(n*(n+1))/2;
        ans=ans-(n-1);
        for(int i=n;i>=1;i--){
            int t=0;
            for(int j=1;j<=i;j++)
            {
               ++t;
                System.out.print(ans++ +" ");
            }
            ans=ans-t-(t-1);
            System.out.println();
        }
    }
}