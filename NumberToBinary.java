import java.util.Scanner;
public class NumberToBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("Enter the number");
         
        int n= sc.nextInt();
        int a[]=new int[10];
        int c=0;
         
        while(n>0){
            a[c++]=n%2;
            n=n/2;
        }
      for(int i=c-1;i>=0;i--)
      System.out.print(a[i]);
    }
}