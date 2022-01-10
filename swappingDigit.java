import java.util.*;
public class swappingDigit {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int cp=n;
     int c=0;
     while(cp>0){
         ++c;
         cp/=10;
     }
     if(c%2==0){
     cp=n;
     int rev=0;
     while(cp>0){
         rev=rev*10+(cp%10);
         cp/=10;
     }
     int swap=0;
     while(rev>0){
         swap=swap*100+(rev%100);
         rev/=100;
     }
     System.out.println(swap);

    }
    else{
        System.out.println("-1");
    }
 }   
}
