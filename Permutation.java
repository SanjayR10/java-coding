import java.util.Scanner;

public class Permutation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        
        for(int i=0;i<s1.length()*2;i++){
            char ch=s1.charAt(i);
            String s=s1.substring(0, i)+s1.substring(i+1)+ch;
            System.out.println(s);
        }
    }

    }

