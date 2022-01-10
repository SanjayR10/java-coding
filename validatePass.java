import java.util.Scanner;

public class validatePass {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        boolean c=true; int count=0;int check=0;
        if(s1.length()<=7||s1.length()>=11)
        {
        c=false;
        ++count;
        }
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(Character.isUpperCase(ch)||Character.isDigit(ch)){
                ++check;
            }
            if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch)){
                c=false;
                ++count;
            }
        }
        if(check==0)
        c=false;

        if(c)
        System.out.println("Crt string");
        else
        System.out.println("not an Crt string");

    }

    }

