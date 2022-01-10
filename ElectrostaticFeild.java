package college_programs;

import java.util.Scanner;

public class ElectrostaticFeild {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the String with "+n+" letters");
        String word=sc.next();
        word=word.toLowerCase();
        int sum=0;
        for(int i=0;i<n;i++)
        {
           if(word.charAt(i)=='p')
               sum=sum+arr[i];
           else
               sum=sum-arr[i];
        }
        sum=sum*100;
        System.out.println(sum);
    }
}
