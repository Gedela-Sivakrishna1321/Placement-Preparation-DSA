package Classroom;
import java.util.Stack;

public class NextGreatestElement {

    // Time Complexity - O(n^2)
    public static void nextGreaterElement(int arr[]) {

        int n = arr.length;

        
        for(int i = 0; i < n ; i++) { 

            boolean nextGreater = false;

            for(int j = i + 1; j < n; j++) {

                if(arr[j] > arr[i]) {
                    arr[i] = arr[j];
                    nextGreater = true;
                    break;
                }
            }

            if(!nextGreater)
                arr[i] = -1;
        }
    
    }

    // Time Complexity - O(n)
    public static void nextGreaterStackApproach(int arr[], int result[]) {

        int n = arr.length;
        Stack<Integer> s = new Stack<>();
       
        for(int i = n - 1; i >= 0 ; i--) {

            // Check the conditions
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                result[i] = -1;
            } 
            else {
                result[i] = arr[s.peek()];
            }

            s.push(i);

        }

    }

    public static void nextGreaterLeft(int arr[], int result[]) {

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < arr.length; i++) {

            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                result[i] = -1;
            }
            else {
                result[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void nextSmallerRight(int arr[],  int result[]) {

        Stack<Integer> s = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--) {

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
    
            if(s.isEmpty()) {
                result[i] = -1;
            }
            else {
                result[i] = arr[s.peek()];
            }
    
            s.push(i);

        }
    }
   
    public static void nextSmallerLeft(int arr[], int result[]) {

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < arr.length; i++) {

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                result[i] = -1;
            }
            else {
                result[i] = arr[s.peek()];
            }

            s.push(i);
        }
    
    }
   
    public static void print(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = {6, 8, 0, 1, 3};
        int arr2[] = {10, 3, 11, 5, 7, 8, 0};
        int result[] = new int[arr2.length];
        print(arr2);
        // nextGreaterElement(arr);
        // nextGreaterStackApproach(arr2, result);
        // nextGreaterLeft(arr2, result); // [-1, 10, -1, 11, 11, 11, 8]
        // nextSmallerRight(arr2, result); // [3, 0, 5, 0, 0, 0, -1]
           nextSmallerLeft(arr2, result); // [-1. -1, 3, 3, 5, 7, -1]
        print(result);

        /*           More Variations of the Problem
         *      1) Next Greater Right
         *      2) Next Greater Left
         *      3) Next Smaller Right
         *      4) Next Smaller Left
         * 
         *      Note:- Time Complexity - O(n) 
         */
    }
    
}
