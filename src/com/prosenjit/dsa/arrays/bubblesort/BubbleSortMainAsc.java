package com.prosenjit.dsa.arrays.bubblesort;

class BubbleSortAsc  {
    int[] arra;

    BubbleSortAsc(int[] arr) {

        this.arra = arr;
    }

    public void swap(int[] arr, int i, int j) {
        if (i == j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] bsort() {
        /*
        This method is my own implementation of bubble sort on unsorted array. I have followed the below logic:
            1. It ia an in-place algorithm with worst time complexity O(n**2) which is Quadratic
            2. Create variable unSortedArray which initially hold array length later it decreases one after full
                iteration in the second loop to create the end boundary of unsorted array and start boundary of sorted
                one.
             4. When we loop through the internal (2nd loop) loop, we check the pair of the values in j and j+1 position
                if j position > j+1 and j+1 < unSortedArray i.e., array length, we swap the value so that largest element
                value goes to end of the array so that we get ascending sorted array.
             5. After completing the full iteration of the internal (2nd) loop, I decrease the unSortedArray value by 1
                unSortedArray - 1. so that it creates the end boundary of unsorted array and start boundary of sorted
                one. Basically we are logically portioning the array.
              6. after exhausting the outer loop in other words when unSortedArray = 0, we get our full sorted array.
                 And method returns the ascending sorted array.

         */
        int unSortedArray = arra.length - 1;
        int i = 0;
        while (i < unSortedArray){
            for (int j=0; j <= unSortedArray; j++){
                if ((j < unSortedArray) && (arra[j] > arra[j+1])) {
                    swap (arra, j , j+1);
                }
            }
            unSortedArray--;
        }

        return arra;
    }
}

public class BubbleSortMainAsc {

    public static void main(String[] args) {

        int[] arrs = {20,35,-15,7,55,1,-22, 10, 24, -98, 128, -123};

        BubbleSortAsc bst = new BubbleSortAsc(arrs);
        int[] sortedArray;
        sortedArray = bst.bsort();
        for (int a : sortedArray) {
            System.out.println(a);
        }
    }

}
