import java.util.Scanner;

public class fascinatingNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=n*2;
        int n3=n*3;
        boolean ss=true;
        String s=n+""+n2+n3;
        for(char i='1';i<='9';i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch==i)
                ++count;
            }
            if(count==0||count>=2){
            ss=false;
            break;
            }
            count=0;
        }
        if(ss)
        System.out.println("Fas");
        else
        System.out.println(" not Fas");
    }
}
