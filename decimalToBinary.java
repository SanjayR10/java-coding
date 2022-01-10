import java.util.*;
public class decimalToBinary {

    static int c=0;
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
        ArrayList<Integer>aa=new ArrayList<>();
        for(int num:a)
        aa.add(num);
            getNoOfCoin(aa,tar,new ArrayList<Integer>());
            System.out.println(c);
   }
          
          public static void getNoOfCoin ( ArrayList<Integer> a,int tar, ArrayList<Integer> arr){
            int ans=0;
            for(int ss:arr)
            ans=ans+ss;
            if(ans==tar)
            ++c;
            if(ans>tar)
            return;
           

            for(int i=0;i<a.size();i++){
                int n=a.get(i);
                ArrayList<Integer>rem=new ArrayList<>();
                for(int j=i+1;j<a.size();j++){
                    rem.add(a.get(j)); 
                }
                ArrayList<Integer> number = new ArrayList<>();
                number.add(n);
                getNoOfCoin(rem, tar, number);
            }
          }
}
