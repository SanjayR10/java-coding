import java.util.*;
public class coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter target");
         int tar=sc.nextInt();
        int c=0; 
        Arrays.sort(a);
       
         for(int i=0;i<n;){
            int ans=0;

            while(true){
                for(int j=0;j<n;j++){
                    ans=ans+a[j];
                    if(ans>=tar)
                    break;
                }
                if(ans==tar)
                ++c;
            }
         }
        
         System.out.print(c);
    }
}
