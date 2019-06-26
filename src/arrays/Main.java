package arrays;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1. Write a Java program to sort a numeric array and a string array

        /*int[] a = new int[10];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.print(a[i] + " ");
        }

        System.out.println();

        Arrays.sort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();

        String[] s = {"Roman","Filka","SuperB", "Orange", "A","C"};

        for (String s1 : s) {
            System.out.print(s1 + " ");
        }

       Arrays.sort(s);
        System.out.println();

        for (String s1 : s) {
            System.out.print(s1 + " ");
        }*/


        // 2.Write a Java program to sum values of an array.

        /*int[] a = new int[10];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.print(a[i] + " ");
        }

        int b = 0;

        System.out.println();
        for (int i : a) {
            b += i;
        }

        System.out.println(b);*/


        // 3. Write a Java program to print the following grid.

       /* int[][] a = new int[10][10];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("-" + " ");
            }
            System.out.println();
        }*/

        // 4. Write a Java program to calculate the average value of array elements.

       /* int[] a = new int[10];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i : a) {
            b += i;
        }

        System.out.print(b + " ");

        System.out.println(b/10);*/

       // 5. Write a Java program to test if an array contains a specific value.

       /* int[] a = new int[10];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i] + " ");
        }

        System.out.println(contains(a, 25));*/

       // 6. Write a Java program to find the index of an array element.

       /* int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);

            System.out.print(a[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " " + a[i]);
        }*/

        // 7. Write a Java program to remove a specific element from an array.

//        int[] a = {1,2,3,4,5,6,7,8,9};

        // 8. Write a Java program to copy an array by iterating the array.
/*
        int[] arr = {2,4,1,57,3};
        int[] brr = arr.clone();

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : brr) {
            System.out.print(i + " ");
        }*/

        // 9. Write a Java program to insert an element (specific position) into an array.

//        int[] a = {1,2,3,4,5,6,7,8,9};
//
//        a[1] = 55;
//
//        for (int i : a) {
//            System.out.println(i);
//        }

        // 10. Write a Java program to find the maximum and minimum value of an array.

        /*int[] arr = {22,1,5,12,654};
        System.out.println(arr.length);

        Arrays.sort(arr);

        System.out.println(arr[4]);
        System.out.println(arr[0]);*/

        // 11. Write a Java program to reverse an array of integer values.

       /* int[] a = {1,2,3,4,5,6,7,8,9};

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }*/

       // 28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.

        /*int[] a = {22,1,4,5,2};

        System.out.println(a.length);

        Arrays.sort(a);

        int max = a[4];
        int min = a[0];

        System.out.println(max - min);*/


        // Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
        // Вывести массив на экран.

       /* int[][] a = new int[5][8];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = r.nextInt(100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }*/

       // Adding new Value into Array
      /*int[] a = {1,2,3,4,5};

      int[] b = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        b[b.length - 1] = 10;

        a = b;

        for (int i : a) {
            System.out.println(i);
        }*/






    }



    public static boolean contains(int[] arr, int item){
        for (int i : arr) {
            if (item == i){
                return true;
            }
        }
        return false;
    }

}
