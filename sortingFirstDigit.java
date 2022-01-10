
import java.util.*;

public class sortingFirstDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> l=new ArrayList<>(); 
        for(int i=0;i<n;i++){
            l.add(sc.nextLine());
        }
        sortt(l);
        
    }
     
    public static void sortt(ArrayList<String> s){
        Collections.sort(s,new Comparator<String>(){
            public int compare(String n,String n1){
                String xy=n+n1;
                String yx=n1+n;
                return yx.compareTo(xy);
            }
        });

        System.out.println(s);
    }   
}
