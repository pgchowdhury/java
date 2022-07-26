package com.prosenjit.dsa.arrays.insertionsort;

class InsertionSortGenericAsc <T extends Number & Comparable<? super T>> {
    T[] arra; //defining the data type as Generic Number type

    InsertionSortGenericAsc (T[] x) { //Constructor
        this.arra = x;
    } // Constructor

    void printArray() { //Method to print the array elements
        for (T a : arra) {
            System.out.println(a);
        }
    }

    void insertSort() {
        int unsortedIndex = 1; // Unsorted Index start from 1 left to right
        int lastUnsortedIndex = arra.length - 1;
        //Start loop for unsorted array starting from 1
        while (unsortedIndex <=  lastUnsortedIndex) {
            T newElement = arra[unsortedIndex]; // new element is the element in unsorted index
            /*
            if newElement < of the previous sorted array elements, then insert the new element before that.
            please note this is sorted one, as soon as we get the position between greater than and less than of
            new element, we can insert into that position and break the loop. we do not need to loop all the element
            */
            int i;
            for (i=unsortedIndex; i > 0 && arra[i-1].compareTo(newElement) >0; i--) { //loop for sorted array,
                arra[i] = arra[i-1];
            }
            arra[i] = newElement; // Inserting the newElement to the correct position.
            unsortedIndex ++;
        }
    }
}

public class InsertionSortAscGenericMain {
    public static void main(String[] args) {

        System.out.println("********** Integer Array **********");
        Integer[] arri = {20, 35, -15, 7, 55, 1, -22, 53, 123, -234};
        InsertionSortGenericAsc<Integer> isai = new InsertionSortGenericAsc<>(arri);
        isai.insertSort(); //Sorting the array
        isai.printArray(); //printing the array elements
        System.out.println();

        System.out.println("********** Float Array **********");
        Float[] arrf = {20.5f, 35.2f, -15.9f, 77.9f, 55.2f, 12.3f, -22.1f, 53.1f, 123.6f, -234.1f};
        InsertionSortGenericAsc<Float> isaf = new InsertionSortGenericAsc<>(arrf);
        isaf.insertSort(); //Sorting the array
        isaf.printArray(); //printing the array elements
        System.out.println();


        System.out.println("********** Double Array **********");
        Double[] arrd = {223.2, 352.3, -153.4, 779.1, 552.6, 123.7, -221.8, 531.6, 123.6, -234.1};
        InsertionSortGenericAsc<Double> isad = new InsertionSortGenericAsc<>(arrd);
        isad.insertSort(); //Sorting the array
        isad.printArray(); //printing the array elements
        System.out.println();


    }
}
