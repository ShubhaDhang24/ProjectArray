
package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        // intArray();
        //sortingArray();
        //copyArray();
        //twoDimension();

        // avgOfNumbers();
        //  printArray();
        // removeDuplicate();
        //multiplicationOfTwoDimensionArr();
        //userInputArray();
        //diagonalElement();
        //randomArray();
    }

   /* public static void randomArray() {
        int r1[] = {22, 43, 44, 53, 67, 56, 88, 90};
        int r2[] = new int[6];
        for (int i = 0; i < r1.length; i++) {
            if ((r1[i] % 2 == 0) && (r1[i] >= (r1.length / 2))) {
                r2[i] = r1[i];

            } else {
                r2[i] = r1[i];
            }
        }

    }*/

    public static void userInputArray() {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the range");
        int n = s.nextInt();
        int ar[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("The array is");
        for (int j = 0; j < n; j++) {
            System.out.println(ar[j]);
        }
        //reversing array
        System.out.println("reversed array");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
    }

    public static void diagonalElement() {

        Scanner s = new Scanner(System.in);
        System.out.println("read rows and columns");
        int n = s.nextInt();
        int m = s.nextInt();
        int ar1[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar1[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ar1[i][j] + "  ");
            }
            System.out.println("  ");
        }
        System.out.println("Diagonal element :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ar1[i] == ar1[j]) {
                    System.out.print(+ar1[i][j]);
                }

            }

            System.out.print("  ");
        }


    }

    public static void intArray() {
        int a1[] = {10, 20, 30, 40};
        for (int i = 0; i < a1.length - 1; i++) {
            System.out.println(a1[i]);
        }

    }

    public static void sortingArray() {
        String[] ar = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("array=" + ar[0] + "," + ar[1] + " , " + ar[2] + " , " + ar[3]);
        Arrays.sort(ar);
        System.out.println("SORTED ARRAY IS : ");
        for (String n : ar)
            System.out.println(n);

    }

    public static void copyArray() {
        int arr[] = {1, 15, 20, 35};
        int copyArr[] = Arrays.copyOf(arr, 4);
        for (int num : copyArr) {
            System.out.println(num + " ");
        }
    }

    public static void twoDimension() {
        String array[][] = new String[][]{{"PARIS", "STOCKHOLM"}, {"NEWYORK", "France"}};
        System.out.println(array[0][0] + " " + array[0][1]);
        System.out.println(array[1][0] + " " + array[1][1]);
    }

    public static void avgOfNumbers() {
        int total = 0;
        int array1[] = {45, 30, 20, 32, 11, 10};
        System.out.println(array1.length);
        for (int i = 0; i < array1.length - 1; i++) {
            total = total + array1[i];
        }
        System.out.println(total);
        float avg = (total / (array1.length));
    }

    public static void printArray() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }

        }
    }

    public static void removeDuplicate() {
        int arr1[] = {20, 20, 10, 30, 45, 45, 60, 55, 35};
        int j = 0;


        int temp[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr1[i + 1]) {
                temp[j++] = arr1[i];
            }
            System.out.println(temp[j]);

        }
    }

    public static void multiplicationOfTwoDimensionArr() {
        int i, j, c = 0;
        int a1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (i = 0; i < a1.length; i++) {
            //System.out.print("\t\t");
            for (j = 0; j < a2.length; j++) {
                c = a1[i] * a2[j];
                System.out.print(c + "\t\t");
            }

            System.out.println("\t");


        }

    }


}