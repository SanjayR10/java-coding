import java.util.Scanner;

public class string1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String te="";
        for(int i=0;i<s.length();i++){
            int c=1;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++){
                char chh=s.charAt(j);
                if(!(i==j)){
                    if(ch==chh)
                    ++c;
                }
            }
            if(!te.contains(Character.toString(ch))){
                System.out.println(ch+":"+c);
                te=te+ch;
            }

        }
    }
}
