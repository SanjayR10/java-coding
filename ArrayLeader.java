package softnerve;

import java.util.Scanner;
public class ArrayLeader {

    static void leaderArray(int arr[],int size){
        int large=0;
        System.out.print("Leader elements are: ");
        for(int i=size-1;i>=0;i--)        //iterate the array from reverse.
        {
          if(arr[i]>large){              //check if large variable is larger than arr[i]th element
              large=arr[i];               //if it is larger ,then assign large as arr[i]th element
              System.out.print(large+" ");        //and print the arr[i]th element.
          }
        }
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);       //instantiate scanner class
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();                       //getting size of the array
        int a[]=new int[n];                       //declare the array
        System.out.println("Enter the Elements of the array");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();                      //Getting array elements
        }
        leaderArray(a,a.length);    //calling the leaderArray method to print the leader elements
    }
}
