package com.prosenjit.dsa.arrays.insertionsort;

class InsertionSortAsc {
    int[] arra; //defining the data type as array integer

    InsertionSortAsc(int[] x) { //Constructor
        this.arra = x;
    } // Constructor

    void printArray() { //Method to print the array elements
        for (int a : arra) {
            System.out.println(a);
        }
    }

    void insertSort() {
        int unsortedIndex = 1; // Unsorted Index start from 1 left to right
        int lastUnsortedIndex = arra.length - 1;
        //Start loop for unsorted array starting from 1
        while (unsortedIndex <=  lastUnsortedIndex) {
            int newElement = arra[unsortedIndex]; // new element is the element in unsorted index
            /*
            if newElement < of the previous sorted array elements, then insert the new element before that.
            please note this is sorted one, as soon as we get the position between greater than and less than of
            new element, we can insert into that position and break the loop. we do not need to loop all the element
            */
            int i;
            for (i=unsortedIndex; i > 0 && arra[i-1] > newElement; i--) { //loop for sorted array,
                arra[i] = arra[i-1];
            }
            arra[i] = newElement; // Inserting the newElement to the correct position.
            unsortedIndex ++;
        }
    }
}

public class InsertionSortAscMain {
    public static void main(String[] args) {

        int[] arri = {20, 35, -15, 7, 55, 1, -22, 53, 123, -234};

        InsertionSortAsc isa = new InsertionSortAsc(arri);
        isa.insertSort(); //Sorting the array
        isa.printArray(); //printing the array elements

    }
}
