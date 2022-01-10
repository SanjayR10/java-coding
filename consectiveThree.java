import java.util.Scanner;
public class consectiveThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
       int n=sc.nextInt();
       int cp=n;
        int c=0;
       while(n>0){
        ++c;
        n/=10;
       }
       n=cp;
       int a[]=new int[c];
       for(int i=c-1;i>=0;i--){
           a[i]=n%10;
           n/=10;
        }
        int inC=0,deC=0,i=0;
        int last=a[0];  
        if(last==0)
        {
            last=a[1];
            i=1;
        }
        
        for(;i<c;i++){
            if(last==a[i]){
                ++last;
                ++inC;
            }
        }

        last=a[0];
        i=0;
        if(last==0)
        {
            last=a[1];
            i=1;
        }
        
        for(;i<c;i++){
            if(last==a[i]){
                --last;
                ++deC;
            }
        }
        if(inC>=3||deC>=3)
        System.out.println("YEs");
        else
        System.out.println("No");
    }
}
