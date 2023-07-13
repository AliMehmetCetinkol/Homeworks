/***
 *  FILE            : ArrayUtil.java
 *  AUTHOR          : Ali Mehmet Çetinkol
 *  LAST UPDATE     : 21.05.2023
 *
 *  ArrayUtil class has some array methods to help us.
 *
 *  Copyleft(c) 1997 by Ali Mehmet Çetinkol All Rights Free
 */

package com.ali.util;
import java.util.Random;



public class ArrayUtil {
    private ArrayUtil()
    {

    }
    /**
     * The program that prints numbers in array.
     * @param a
     */
    public static void print(int [] a)
    {
        for(int i=0;i< a.length;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.print("%n-------------%n");
    }

    /**
     * The program that prints numbers in array with formatted.
     * @param n
     * @param a
     */
    public static void print(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for(int ival : a){
            System.out.printf(fmt,ival);
        }
        System.out.println();
    }

    /**
     * The program that prints numbers in matrix array.
     * @param n
     * @param a
     */
    public static void print(int n,int [][]a)
    {
        for(int[] array : a)
            print(n,array);
    }
    public static void print(int [][]a)
    {
        print(1,a);
    }
    public static void print(String [] s)
    {
        for(String str : s)
            System.out.println(str);
    }

    /**
     * It changes the values held by the indexes taken from the integer array type.
     *
     * @param a
     * @param i
     * @param k
     */
    public static void swap(int [] a, int i, int k){
        int temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    /**
     * It changes the values held by the indexes taken from the char array type.
     * @param a
     * @param i
     * @param k
     */
    public static void swap(char [] a, int i, int k){
        char temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    /**
     * Fills the array with random numbers.
     * @param r
     * @param a
     * @param min
     * @param bound
     */
    public static void fillRandomArray(Random r , int []a , int min, int bound)
    {
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt(min,bound);
        }
    }
    /**
     * It helps us to get a random number sequence.
     * @param r
     * @param count
     * @param min
     * @param bound
     * @return array
     */
    public static int [] getRandomArray(Random r, int count, int min, int bound)
    {
        int []a = new int[count];
        fillRandomArray(r,a,min,bound);
        return a;
    }

    /**
     * Program that returns the sum of the elements of the array.
     * @param a
     * @return int
     */
    public static int sum(int [] a)
    {
        int total = 0;
        for (int val : a) {
            total += val;
        }
        return total;
    }
    /**
     * Program that returns the sum of the elements of a two-dimensional array.
     * @param a
     * @return int
     */
    public static int sum(int [][] a)
    {
        int total = 0;
        for (int i=0;i<a.length;i++) {
            total += sum(a[i]);
        }
        return total;
    }
    /**
     * Program that reverses the elements of an array.
     * @param a
     */
    public static void reverse(int [] a)
    {
        for(int i=0;i<a.length/2;i++)
            swap(a,i,a.length - i - 1);
    }

    /**
     * This reverse method is overload with char type.
     * @param a
     */
    public static void reverse(char [] a)
    {
        for(int i=0;i<a.length/2;i++)
            swap(a,i,a.length - i - 1);
    }

    /**
     * Returns the union of two int arrays taken with the parameter.
     * @param a
     * @param b
     * @return array
     */
    public static int [] join(int []a, int []b)
    {
        int [] result = new int[a.length + b.length];
        int idx = 0;
        for (int val : a) {
            result[idx++] = val;
        }
        for (int val : b) {
            result[idx++] = val;
        }
        return result;
    }

    /**
     * Sorting from smallest to largest
     * @param a
     */
    private static void bubbleSortAscending(int [] a)
    {
        for(int i=0;i< a.length-1;i++)
            for(int k = 0; k < a.length-1-i;k++)
                if(a[k] > a[k+1])
                    swap(a,k,k+1);
    }

    /**
     * Sorting from largest to smallest.
     * @param a
     */
    private static void bubbleSortDescending(int [] a)
    {
        for(int i=0;i< a.length-1;i++)
            for(int k = 0; k < a.length-1-i;k++)
                if(a[k] < a[k+1])
                    swap(a,k,k+1);
    }

    /**
     * In the bubble sort algorithm, two adjacent elements of the array are compared and replaced according to the situation.
     * At each iteration, the largest element goes to the end of the collapsed array.
     * Thus, in each iteration, it is sufficient to go back one step from the previous one.
     * @param a
     * @param descending
     */
    public static void bubbleSort(int [] a, boolean descending)
    {
        if(descending)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);

    }
    public static void bubbleSort(int [] a)
    {
        bubbleSort(a,false);
    }

    /**
     * Decreasing selection sort
     * @param a
     */
    private static void selectionSortDescending(int [] a)
    {
        int max, maxIndex;

        for(int i=0;i<a.length-1;i++){
            max = a[i];
            maxIndex=i;

            for(int k = i + 1; k< a.length;k++)
                if(max < a[k]){
                    max = a[k];
                    maxIndex = k;
                }

            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    /**
     * Increasing selection sort
     * @param a
     */
    private static void selectionSortAscending(int [] a)
    {
        int min, minIndex;

        for(int i=0;i<a.length-1;i++){
            min = a[i];
            minIndex=i;

            for(int k = i + 1; k< a.length;k++)
                if(min > a[k]){
                    min = a[k];
                    minIndex = k;
                }

            a[minIndex] = a[i];
            a[i] = min;
        }
    }

    /**
     * The program finds where the smallest number in the array is at each step.
     * By replacing this number with the number at the beginning of the array,
     * the smallest numbers are selected and it is thrown to the beginning.
     * @param a
     */
    public static void selectionSort(int [] a)
    {
        selectionSort(a,false);
    }
    public static void selectionSort(int [] a, boolean descending)
    {
        if(descending)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }

    /**
     * Selects a number in the middle point (mean) of the array to be sorted,
     * and sorts all other numbers by classifying them as greater or less than this middle number.
     * @param a
     * @param threshold
     * @return int
     */
    public static int partition(int []a , int threshold)
    {
        int partitionIndex = 0;

        while(partitionIndex != a.length && a[partitionIndex] < threshold)
            ++partitionIndex;
        if(partitionIndex == a.length)
            return partitionIndex;

        for(int i= partitionIndex + 1; i < a.length; i++)
            if(a[i] < threshold)
                swap(a,i,partitionIndex);

        return partitionIndex;
    }

    /**
     * The method takes an array of type int and a number n of type int.
     * The method returns an array of counters containing how many of the numbers [0, n] are in array a.
     * @param a
     * @param n
     * @return int array
     */
    public static int[] getHistogramData(int[] a, int n)
    {
        int [] counts = new int[n+1];

        for(int val : a)
            ++counts[val];

        return counts;
    }

    /**
     * The program that finds the most repeated number in the array.
     * @param n
     */
    public static void mod(int []n)
    {
        int j,i,freq = 0;

        for(i=0;i<n.length;i++){
            freq=1;
            for( j=i+1;j<n.length;j++){
                if(n[i] == n[j]){
                    freq++;
                }else{
                    break;
                }
            }
            i=j-1;
            if(freq >1){
                System.out.printf("duplicated number is : %d ",n[i]);
            }
        }
    }

    /**
     * The program that generates a random matrix.
     * @param r
     * @param m
     * @param n
     * @param min
     * @param max
     * @return int array
     */
    public static int[][] getRandomMatrix(Random r, int m,int n,int min,int max)
    {
        int [][] a = new int[m][];

        for(int i=0;i<m;i++)
            a[i] = getRandomArray(r,n,min,max);

        return a;
    }

    /**
     * The program that generates a random square matrix.
     * @param r
     * @param m
     * @param min
     * @param max
     * @return int array
     */
    public static int[][] getRandomSquareMatrix(Random r, int m,int min,int max)
    {
        return getRandomMatrix(r,m,m,min,max);
    }

    /**
     * The program that checks if the array are matrix
     * @param a
     * @return
     */
    public static boolean isMatrix(int [][]a)
    {
        for(int i=1;i<a.length;i++)
            if(a[0].length != a[i].length)
                return false;

        return true;
    }

    /**
     * The program that checks if the matrix is square.
     * @param a
     * @return boolean
     */
    public static boolean isSquareMatrix(int [][]a)
    {
        return (isMatrix(a) && a.length == a[0].length);
    }

    /**
     * The program that does addition in linear algebra.
     * @param a
     * @return
     */
    public static int sumDiagonal(int[][]a)
    {
        int total=0;
        for(int i=0;i<a.length;i++){
            total += a[i][i];
        }
        return total;
    }

    /**
     * In linear algebra, the backcross of an A string is expressed as Aᵀ.
     * @param m
     * @return int array
     */
    public static int[][] transpose(int[][]m)
    {
        int [][] result = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                result[j][i] =m[i][j];
            }
        }
        return result;
    }
    /**
     * The program that finds the biggest value in the array.
     * @param a
     * @return int array
     */

    public static int max(int []a)
    {
        int result = a[0];
        for(int i=0;i<a.length;i++){
            result = Math.max(result,a[i]);
        }
        return result;
    }
    /**
     * The program that finds the smallest value in the array.
     * @param a
     * @return int array
     */
    public static int min(int []a)
    {
        int result = a[0];
        for(int i=0;i<a.length;i++){
            result = Math.min(result,a[i]);
        }
        return result;
    }
}
