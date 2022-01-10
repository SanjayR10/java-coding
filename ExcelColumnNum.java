import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ExcelColumnNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int result=0;
        for(int i=0;i<n.length();i++){
            result=result*26;
            result=result+n.charAt(i)-'A'+1;
        }

        System.out.println(result);
    }
}
