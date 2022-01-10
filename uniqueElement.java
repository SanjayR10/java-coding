import java.util.*;
public class uniqueElement {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
       int c=0,unique;
       boolean s=true;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i==j)
               continue;
               else
               {
                   if(a[i]==a[j]){
                    ++c;
                   }
               }
            }
               if(c==0&&){
               unique=a[i];
               if(unique<)
               s=false;
               }
               c=0;
           }
           if(s)
           System.out.print("No unique element");
       }
       
   } 

