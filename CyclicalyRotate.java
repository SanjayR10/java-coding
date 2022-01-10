import java.util.Scanner;

class CyclicalyRotate
{

    public static void rotate (int arr[]){
        int i = 0, j = arr.length - 1;
       while(i != j)
       {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
       }
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        System.out.println("Enter how much time to rotate element of array");
        int rot=sc.nextInt();

        System.out.println("Orginal array");
        printArray(a);

        for(int i=0;i<rot;i++)
        rotate(a);
        
        

        System.out.println("After rotated array");
        printArray(a);
    }
}