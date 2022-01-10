import java.util.*;
public class RevWordInSen {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=s+" ";
        String sub;
        int j=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                sub=s.substring(j,i);
                StringBuilder sb=new StringBuilder(sub);
                ans=ans+sb.reverse();
                // System.out.println(sub);
                j=i+1;
            }
            
        }
        System.out.println(ans);
    }
}
