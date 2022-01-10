import java.util.Arrays;
import java.util.*;

public class arrangeDigit {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String s[]=new String [n];
       sc.nextLine();
       for(int i=0;i<n;i++){
           s[i]=sc.next();
       }

     reArn(s);


    if(n==1){
        System.out.print(Arrays.toString(s));
    }
    else if(n%2==0){
            changeString(s);
    }
    // else{

    // }
   }
   public static void reArn(String s[]){
       int len=s[0].length();
    for(int i=0;i<s.length;i++){
        if(!(len==s[i].length())){
            if(len<s[i].length())
            {
                String tem=s[0];
                s[0]=s[i];
                s[i]=tem;
            }
            else{
                String tem=s[s.length-1];
                s[s.length-1]=s[i];
                s[i]=tem;
            }
        }
    }
   }
   public static void changeString(String s[]){

        for(int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++){    
                if(i!=j){
                    
                }
            }
        }
        
    
   } 
}
