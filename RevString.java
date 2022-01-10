import java.util.*;

public class revString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String onlyApla="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)||Character.isAlphabetic(ch))
            onlyApla=onlyApla+(ch+"");
        }
        // System.out.println(onlyApla);
        int t=onlyApla.length()-1;
        for(String i:s.split(" ")){
            for(int j=0;j<i.length();j++){
                char chh=i.charAt(j);
                if(Character.isDigit(chh)||Character.isAlphabetic(chh)){
                    System.out.print(onlyApla.charAt(t--));
                }
                else
                System.out.print(chh);
            }
            System.out.print(" ");
        }
    }
}
