import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class LongestConsectiveSe {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int a []=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i:a)
        hs.add(i);
        int lar=1;
        // System.out.println(hs);
        for(int i=0;i<n;i++){
            int tem=1;
            if(!hs.contains(a[i]-1)){
                int k=a[i];
                while(hs.contains(k+1)){
                    k=k+1;
                    ++tem;
                    }
                }
                if(tem>lar)
                lar=tem;
            }
            System.out.println("Largest sequence:"+lar);
        }
    }
