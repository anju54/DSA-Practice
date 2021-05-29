package com.wissen;

/***
 * Given an array arr[] of size N, the task is to rearrange the array elements such that
 * all the Prime numbers are placed before the Non-prime numbers.
 * https://www.geeksforgeeks.org/segregate-prime-and-non-prime-numbers-in-an-array/
 */

public class Seggregateprime {

    private static int[] segregatePrime(int []arr){

        int left = 0; int right = arr.length -1;

        while (left<right){
            // if left is prime then increment
            while (checkPrime(arr[left]))
                left++;
            // if right is non-prime then decrement
            while (!checkPrime(arr[right]))
                right--;
            if (left<right){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        return arr;
    }

    public static boolean checkPrime(int num){

        if (num==0 || num == 2)
            return true;
        if (num == 1)
            return false;
        if (num%2==0)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{1, 8, 2, 3, 4, 5, 7, 20};
        System.out.println(checkPrime(7));
        segregatePrime(arr);
    }

}
