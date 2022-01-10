import java.util.Scanner;
import java.util.Stack;

public class balancing {
    public boolean isBalanced(String nn)
    {
        Stack<Character> stack= new Stack<>();
       for(int i=0;i<nn.length();i++) {
           char ch = nn.charAt(i);
           if (ch == '{' || ch == '(' || ch == '[') {
               stack.push(ch);
               continue;
           }
           if (stack.isEmpty()) {
               return false;
           }

           char chk;
           switch (ch) {
               case ')':
                   chk = stack.pop();
                   if (chk == '{' || chk == '[')
                       return false;
                   break;

               case '}':
                   chk = stack.pop();
                   if (chk == '(' || chk == '[')
                       return false;
                   break;

               case ']':
                   chk = stack.pop();
                   if (chk == '(' || chk == '{')
                       return false;
                   break;
           }
       }
       if(stack.isEmpty())
           return false;

       }



    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        if(isBalanced(n))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
