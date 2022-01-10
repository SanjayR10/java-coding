package Programs;

public class RainTraping {

    public static int rainTraping(int a[],int n)
    {
        int trapped=0;
        for(int i=1;i<n-1;i++){
            int left_max=findMaxLeft(a,n,i);
            int right_max=findMaxRight(a,n,i);
            trapped+=Math.min(left_max,right_max)-a[i];
        }
        return trapped;
    }

    static int findMaxLeft(int a[],int n,int index){
        int max=0;
        for(int i=0;i<=index;i++){
            max=Math.max(max,a[i]);
        }
        return max;
    }

    static int findMaxRight(int a[],int n,int index){
        int max=0;
        for(int i=n-1;i>=index;i--){
            max=Math.max(max,a[i]);
        }
        return max;
    }


    public  static  void main(String args[]){
        int arr[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
       System.out.println(rainTraping(arr, arr.length));
    }

}
