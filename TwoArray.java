import java.util.*;
class TwoArray{
    public static void main(String args[]){
       Scanner sc=new Scanner (System.in);
       ArrayList<Integer> l=new ArrayList<>();
       System.out.println("Enter row");
       int r=sc.nextInt();
       System.out.println("Enter column");
       int c=sc.nextInt();
       System.out.println("Enter the elements");
       int a[][]=new int[r][c];
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               a[i][j]=sc.nextInt();
               }
       }
    int sum=0;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
           sum=sum+a[i][j];
            }
            l.add(sum);
            sum=0;
    }
  System.out.println(Collections.max(l));
    }
}