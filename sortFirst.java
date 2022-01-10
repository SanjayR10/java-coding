import java.util.Arrays;
import java.util.*;
public class sortFirst {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Element of array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        String minStr="",tem="";
       for(int i=0;i<n-1;i++){
           int min_index=i;
            if(Integer.toString(a[i]).length()==1)
            minStr=Integer.toString(a[i]).charAt(0)+"";
            else
            minStr=Integer.toString(a[i]);

           for(int j=i+1;j<n;j++){
               if(Integer.toString(a[i]).length()==1)
                tem=Integer.toString(a[j]).charAt(0)+"";
                else
                tem=Integer.toString(a[j]);

               if(tem.compareTo(minStr)>0){
                    minStr=Integer.toString(a[j]).charAt(0)+"";
                    min_index=j;
               }
           }
           if(min_index!=i){
               int temm=a[min_index];
               a[min_index]=a[i];
               a[i]=temm;
           }
       }
       for(int i=0;i<n;i++){
           if(a[i]>=10)
           continue;
           int min_in=i;
           for(int j=0;j<n;j++){
                   tem=Integer.toString(a[j]).charAt(0)+"";
                   int k=Integer.parseInt(tem);
                   if(a[min_in]==k){
                      
                   }
                   a[j]=a[min_in];
               }
           }
       
       System.out.println(Arrays.toString(a));
    }

    public static swift();
    
}
