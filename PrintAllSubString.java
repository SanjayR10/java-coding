package Programs;

public class PrintAllSubString {

    static void printAllSubString(String s){
        for(int i=0;i<s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(i<j)
                System.out.println(s.substring(i,j));
            }
        }
    }

    public static void main(String args[]){
        String s="abc";
        printAllSubString(s);
    }
}
