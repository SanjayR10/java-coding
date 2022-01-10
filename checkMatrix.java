import java.util.Arrays;
import java.util.Scanner;

public class checkMatrix {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a[][]={{0,1,1},{1,1,1},{1,1,1}};
        int n=3;
        int nn=3,lar=0,c=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<nn;j++){
                if(a[i][j]==1)
                ++c;
                else
                {
                    if(lar<c){
                        lar=c;
                    }
                    c=0;
                }
            }
        }

        System.out.print(lar);
      

    }
}
