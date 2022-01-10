package softnerve;

import java.util.Scanner;
public class MaxStockProfit {

    static int maxStock(int arr[],int size){

        int profit=0;                  //set profit as zero

        for(int i=0;i<size-1;i++){       //iterate the array excluding the last element
            int j=i;
            while(j<size){               //iterate the array from the i-th  element to end
                int dif=arr[i]-arr[j];   //find the diff of arr[i] and arr[j]
                if(dif<=0)               //if dif <= 0, then do the following in the if block
                {
                  dif=Math.abs(dif);     //change the diff sign to +ve
                  if(dif>=profit)         //check dif >=profit,then assign profit as dif.
                      profit=dif;
                }
                j+=1;
            }
        }
        return profit;
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);       //instantiate scanner class
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();                       //getting size of the array
        if(n<=0||n>105){                          //checking for the length is valid ot not
            System.out.println("Invalid length");
            System.exit(0);
        }
        int a[]=new int[n];                       //declare the array
        System.out.println("Enter the Elements of the array");
        for(int i=0;i<n;i++) {                //Getting array elements
            a[i] = sc.nextInt();
            if(a[i]<0||a[i]>104){              //checking for the price is valid or not
                System.out.println("Invalid price");
                System.exit(0);
            }
        }
        //calling the maxStoack method to print the max profit
        System.out.println("Maximum profit: "+maxStock(a,a.length));
    }
}
