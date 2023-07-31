
package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        intArray();
       sortingArray();
        copyArray();
        twoDimension();
        avgOfNumbers();
        printArray();
       // removeDuplicate();
        multiplicationOfTwoDimensionArr();
    }

    public static void intArray(){
        int a1[]={10,20,30,40};
        for(int i=0;i<a1.length-1;i++) {
            System.out.println(a1[i]);
        }

    }
public static void sortingArray(){
        String[] ar={"Paris", "London", "New York", "Stockholm"};
    System.out.println("array=" +ar[0]+","+ar[1]+" , "+ar[2]+" , "+ar[3]);
    Arrays.sort(ar);
    System.out.println("SORTED ARRAY IS : ");
    for (String n:ar)
        System.out.println(n);

}public static void copyArray(){
        int arr[]={1,15,20,35};
        int copyArr[]=Arrays.copyOf(arr,4);
        for (int num:copyArr)
        {
            System.out.println(num+" ");
        }
    }
    public static void twoDimension()
    {
        String array[][]=new String[][] {{"PARIS","STOCKHOLM"},{"NEWYORK","France"}};
        System.out.println(array[0][0]+" "+array[0][1]);
        System.out.println(array[1][0]+" "+array[1][1]);
    }
    public static void avgOfNumbers()
    {
        int total =0;
        int array1[]={45,30,20,32,11,10};
        System.out.println(array1.length);
        for (int i=0;i<array1.length-1;i++)
        {
             total=total+array1[i];
        }
        System.out.println(total);
        float avg=(total/(array1.length));
    }
    public static void printArray(){
        int a[]={1,2,3,4,5,6,7,8,9,0};
        for (int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }

        }
    }
    public static void removeDuplicate()
    {
        int arr1[]={20,20,10,30,45,45,60,55,35};
        int j=0;



           int temp[]=new int[arr1.length];
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr1[i+1])
                {
                    temp[j++]=arr1[i];
                }
                System.out.println(temp[j]);

        }
    }
    public static void multiplicationOfTwoDimensionArr()
    {
        int i,j,c = 0;
        int a1[]={1,2,3,4,5,6,7,8,9,10};
        int a2[]={1,2,3,4,5,6,7,8,9,10};
        for( i=0;i<a1.length;i++)
        {
            //System.out.print("\t\t");
            for(j=0;j<a2.length;j++)
            {
                c =a1[i]*a2[j];
                System.out.print(c + "\t\t");
            }

            System.out.println("\t");


        }

    }









}