package com.prosenjit.dsa.arrays.selectionsort;

class SelectionSortAscGeneric <T extends Number & Comparable<? super T>> {

    T[] arra; // Initializing the data

    SelectionSortAscGeneric(T[] x) {    // constructor

        this.arra = x;
    }

    void swap(T[] a, int i, int j) {
        if (i == j) { // this method will swap the data, given the array and two indexes to swap between
            return;
        }
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void printArray() { // Method to print teh array element
        for (T a : arra) {
            System.out.println(a);
        }
    }

    void selectionSort() {
        int lastUnsortIndex = arra.length - 1; // Initial last unsort array index is the last index
        while (lastUnsortIndex > 0) { // while loop till the lastUnsortIndex > 0 where lastUnsortIndex decrement 1
            int largestElementIndex = 0; // largest element index set to 0 before we compare anything in this iteration

            for (int j=1; j <= lastUnsortIndex; j++) { // 2nd loop to select largest element index and swap with the last index
                if (arra[j].compareTo(arra[largestElementIndex]) > 0) { // if element of j > largestElementIndex element then we set the largestElementIndex=j
                    largestElementIndex = j;
                }
            }

            swap(arra, largestElementIndex, lastUnsortIndex); // After iteration complete - swap with the largestElementIndex to lastUnsortIndex
            lastUnsortIndex--; // decrement the lastUnsortIndex by 1 for each iteration, basically move sorted partition left
        }
    }

}

public class SelectionSortAscGenericMain {
    public static void main(String[] args) {

        System.out.println("*********** Integer Array ************");
        Integer[] arri = {20, 35, -15, 7, 55, 1, -22};
        SelectionSortAscGeneric<Integer> ssai = new SelectionSortAscGeneric<>(arri);
        ssai.selectionSort();
        ssai.printArray();

        System.out.println("*********** Float Array ************");
        Float[] arrf = {20.5f, 35.9f, -15.0f, 7.1f, 55.4f, 1.2f, -22.4f};
        SelectionSortAscGeneric<Float> ssaf = new SelectionSortAscGeneric<>(arrf);
        ssaf.selectionSort();
        ssaf.printArray();

        System.out.println("*********** Double Array ************");
        Double[] arrd = {20.7, 135.2, -215.0, 72.1, 515.4, 11.3, -22.4};
        SelectionSortAscGeneric<Double> ssad = new SelectionSortAscGeneric<>(arrd);
        ssad.selectionSort();
        ssad.printArray();
    }
}
