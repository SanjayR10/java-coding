import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int prime[]={67,71,73,79,83,89,97,101,103,107,109,113};
        int t=sc.nextInt();
        for(int g=0;g<t;g++)
        {
            int n=sc.nextInt();

            String word=sc.nextLine();
            char[] ch = new char[word.length()];

            for (int i = 0; i < word.length(); i++) {
                ch[i] = word.charAt(i);
            }
            for (int i = 0; i < word.length(); i++) {
                int in= ch[i];
                for(int j=0;j<prime.length;j++) {
                    if (in > prime[j]) {
                        System.out.print((char) prime[j]);
                        break;
                    }
                }
            }
        }


    }
}
