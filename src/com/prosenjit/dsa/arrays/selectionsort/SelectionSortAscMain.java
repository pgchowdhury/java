package com.prosenjit.dsa.arrays.selectionsort;

class SelectionSortAsc {

    int[] arra; // Initializing the data

    SelectionSortAsc(int[] x) {    // constructor
        this.arra = x;
    }

    void swap(int[] a, int i, int j) {
        if (i == j) { // this method will swap the data, given the array and two indexes to swap between
            return;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void printArray() {
        for (int a : arra) {
            System.out.println(a);
        }
    }

    void selectionSort() {
        int lastUnsortIndex = arra.length - 1; // Initial last unsort array index is the last index
        while (lastUnsortIndex > 0) { // while loop till the lastUnsortIndex > 0 where lastUnsortIndex decrement 1
            int largestElementIndex = 0; // largest element index set to 0 before we compare anything in this iteration

            for (int j=1; j <= lastUnsortIndex; j++) { // 2nd loop to select largest element index and swap with the last index
                if (arra[j] > arra[largestElementIndex]) { // if element of j > largestElementIndex element then we set the largestElementIndex=j
                    largestElementIndex = j;
                }
            }

            swap(arra, largestElementIndex, lastUnsortIndex); // After iteration complete - swap with the largestElementIndex to lastUnsortIndex
            lastUnsortIndex--; // decrement the lastUnsortIndex by 1 for each iteration, basically move sorted partition left
        }
    }

}

public class SelectionSortAscMain {
    public static void main(String[] args) {
        int[] arri = {20, 35, -15, 7, 55, 1, -22};
        SelectionSortAsc ssa = new SelectionSortAsc(arri);

        ssa.selectionSort();
        ssa.printArray();
    }
}
