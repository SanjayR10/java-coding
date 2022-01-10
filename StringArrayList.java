package softnerve;

import java.util.*;

public class StringArrayList {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        boolean iterater = true;


        while (iterater) {
            System.out.println("1.Append");
            System.out.println("2.Insert");
            System.out.println("3.Search");
            System.out.println("4.Strings staring with a letter");
            System.out.println("5.PrintArrayList");
            System.out.println("6.Exit");

            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the string to append");
                    list.add(sc.next());
                    break;
                case 2:
                    System.out.println("Enter the string to insert");
                    String input=sc.next();
                    System.out.println("Enter the index to insert in");
                    list.add(sc.nextInt(), input);
                    System.out.println("Inserted successfully");
                    break;
                case 3:
                    System.out.println("Enter the string to search for");
                    if(list.contains(sc.next()))
                        System.out.println("String is present in arraylist");
                    else
                        System.out.println("String is not present in arraylist");
                    break;
                case 4:
                    System.out.println("Enter the letter");
                    char ch=sc.next().charAt(0);
                    list.forEach((nn) -> {
                        if(nn.charAt(0)==ch) {
                            System.out.print(nn+" ");
                        }
                    });
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Arraylist element are below:");
                    System.out.println(list);
                    break;
                case 6:
                    iterater=false;
                    break;
            }
        }


    }
}
