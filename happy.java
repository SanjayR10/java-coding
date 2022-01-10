import java.util.Scanner;

public class happy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(happyNum(n));
    }
    public static boolean happyNum(int n){
        if(n==1||n==7)
        return true;
        
            int sum=n;int x=n;
            while(sum>9){
                sum=0;
                while(x>0){
                    sum=sum+(x%10)*(x%10);
                    x/=10;
                }
                if(sum==1)
                return true;
                x=sum;
            }
            if(sum==7)
            return true;
            return false;
        
    }
}
