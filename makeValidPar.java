import java.util.*;

public class makeValidPar {
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int open=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='(')
            open++;
            else if(ch==')'){
                if(open==0)
                continue;
                open--;
            }
            sb.append(ch);
        }
        StringBuilder res=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--){
            if((sb.charAt(i)=='(') && (open--)>0){
                continue;
            }
            res.append(sb.charAt(i));
        }
        System.out.print(res.reverse());
   } 
}
