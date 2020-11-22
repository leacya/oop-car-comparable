package com.dkit.sd2.anneleacy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 */
public class App
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
//

//    A. How does compareTo() work for Strings?
        System.out.println("please enter s1");
        String s1 = keyboard.nextLine();
        System.out.println("please enter s2");
        String s2 = keyboard.nextLine();
        System.out.println(s1.compareTo(s2));
//
//        TODO #1 examine the .equalsIgnoreCase() method of the String class
//
//
//     B.  How does Arrays.sort() and Collections.sort() work for String objects?
//        String[] names =
//                {
//                        "shane", "john", "tom", "mary"
//                };
//        for (String n : names)
//        {
//            System.out.print(n + " ");
//        }
//        Arrays.sort(names);
//
//        System.out.println("\nAfter sort:");
//        for (String n : names)
//        {
//            System.out.print(n + " ");
//        }
//        System.out.println("");
//
////     Additional: sort that ignores case
//        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
//
//        System.out.println("\nAfter sort:");
//        for (String n : names)
//        {
//            System.out.print(n + " ");
//        }
//        System.out.println("");
//
//
//     C. How to get "sort"  to work for our own objects.....
//      Class must implement the Comparable interface,
//            giving the implementation of the compareTo() method
//            or the "natural ordering" of instances of the class


//        Car cars[] = new Car[4];
//
//        cars[0] = new Car("Toyota", "Corolla", 1.6);
//        cars[1] = new Car("Daihatsu", "Diamond", 1.4);
//        cars[2] = new Car("Nissan", "Patrol", 2.5);
//        cars[3] = new Car("Bugatti", "Vyron", 4.5);
//
//        // Arrays.sort() will sort Car objects based on their natural ordering
//        Arrays.sort(cars);
//        System.out.println("cars array after Arrays.sort( cars )");
//
//        for (Car c : cars)
//            System.out.println(c);
//
//        ArrayList<Car> carList = new ArrayList<Car>();
//
//        carList.add(new Car("Toyota", "Corolla", 1.6));
//        carList.add(new Car("Daihatsu", "Diamond", 1.4));
//        carList.add(new Car("Nissan", "Patrol", 2.5));
//        carList.add(new Car("Bugatti", "Vyron", 4.5));

//        // Collections.sort() will sort Car objects based on their natural ordering
//        Collections.sort(carList);
//
//        System.out.println("\ncarList ArrayList after Collections.sort( carList )");
//
//        for (Car c : carList)
//            System.out.println(c);
//
//        // TODO #2: Modify the code to sort Car objects based on their Make.
//                    How does your solution deal with uppercase & lowercase letters?
//
//        // sort Car objects based on their natural ordering, in REVERSE
//        Collections.sort(carList, Collections.reverseOrder());
//
//        System.out.println("\ncarList ArrayList after Collections.sort( carList, Collections.reverseOrder() )");
//
//        for (Car c : carList)
//            System.out.println(c);

//      //TODO #3 Implement and test compareTo() for the Person class based on age field
//                Display an arraylist of Person objects sorted based on age





        //TODO #4 Consider how you might sort Person objects that are of equal age, in order based on their name





    }
}
