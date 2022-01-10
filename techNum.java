import java.util.Scanner;

public class techNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=(int)Math.log10(n)+1;
        if(c%2==0)
        {   
            int cp=n;
            int first=cp%(int)(Math.pow(10,c/2));
            int last=cp/(int)(Math.pow(10,c/2));
            int sum=(first+last)*(first+last);
            System.out.println(sum);
            if(sum==n)
            System.out.println("Tech num");
            else
            System.out.println("not Tech num");
        }
        else
        System.out.println("Not Tech num");
    }
}
