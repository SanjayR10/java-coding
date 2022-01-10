package softnerve;

import java.util.Scanner;

public class XorSum {

    static void findSum (int arr[]){
        int size=arr.length;      //store the array len in size variable
        int bitwise=0;            //initialize bitwise as zero

        //find the bitwise operation for all the element in array
        for(int i=0;i<size;i++) {
            bitwise = bitwise | arr[i];
        }
        //final answers is equals to bitwise*(2^size-1)
        int answer=bitwise*(int)Math.pow(2,size-1);
        System.out.println(answer);
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
        //calling the findSum method to print the answer.
        findSum(a);
    }
}
