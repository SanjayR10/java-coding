import java.util.*;
public class Anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string one");
        String n=sc.nextLine();
        System.out.println("Enter string two");
        String n1=sc.nextLine();
       int c=0;
       for(int i=0;i<n.length();i++){
           String ch=n.charAt(i)+" ";
           ch=ch.trim();
           if(n1.contains(ch)){
               ++c;
           }
       }
        if(c==n.length())
        System.out.println("Anagram");
        else
        System.out.println("Not an Anagram");

    }
}
