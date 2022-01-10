import java.util.*;
public class Amstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int cp=n;int ans=0;
        while(n>0)
        {
          ans=ans+(n%10)*(n%10)*(n%10); 
          n/=10; 
        }
        if(cp==ans)
        System.out.println("Amrstibg");
        else
        System.out.println("Not Armstrong");
    }
}
