import java.util.*;
public class binaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int carry = 0 ; 
        String ans = " ";
        while(a!=0 || b!=0){
            int r = ((a%10)+(b%10)+carry)%2;
            ans = r+ans;
            carry = ((a%10) + (b%10)+carry)/2;
            a/=10;
            b/=10;
        }
        if(carry==1){
            ans=carry+ans;
        }
        System.out.println(ans);
    }
}
