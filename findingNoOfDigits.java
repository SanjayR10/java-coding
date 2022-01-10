import java.util.*;
public class findingNoOfDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=(int)Math.log10(n)+1;
        int last=(int)(n/((int)Math.pow(10,c-1)));
        System.out.println(last);
    }
}
