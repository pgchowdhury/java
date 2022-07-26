package com.prosenjit.dsa.arrays.shellsort;

class ShellSortAsc {

    int[] arra; //Defining the data

    //Defining the constructor
    ShellSortAsc(int[] x) {
        this.arra = x;
    }

    //Method to print the array
    void printArray() {
        for (int a : arra) {
            System.out.println(a);
        }
    }

    void shellSort() {
        /*
        Before entering into Insertion sort, Shell Sort does some premiminary work so there will be less loop than
        Insertion Sort. Shell Sort start at larger sort value. As the algorithm progress gap is reduced. Goal is to
        reduce the amount of shifting required. There rea tons of gap value and most used one is Knuth's theory which
        says (3**k - 1)/2 is the gap value. K value will be such so that result of expression will be close but less
        than the array lenght. But for simplicity I have used array.length/2 as gap value. We keep reducing the gap
        value till it becomes 1. Once we reach one we peform the Insertion Sort will remaining Unsorted value. But the
        time we got to Insertion sort, the array has been partially sorted.
         */

        // for this implementation I am using Gap N/2. But the Kunth theory is most common (3**k - 1)/2
        int gap = Math.round((arra.length)/2);
        // in each iteration gap will be gap/2 till it does not become 1

        while (gap >= 1) {

            System.out.println("Gap check while loop");
            if (gap > 1) {
                int j;
                int lastUnsortedIndex = arra.length - 1;
                for (j = lastUnsortedIndex; j-gap >= 0; j=j-gap) {
                    int newElement2 = arra[j];
                    System.out.println("Second loop to do the preliminary work before Insertion Sort loop");
                    if (newElement2 < arra[j-gap]) {
                        arra[j] = arra[j - gap];
                    }
                    arra[j-gap] = newElement2;
                }
            }

            if (gap == 1) { // this one our insertion sort when gap==1
                printArray();
                int unsortedIndex = 1; // Unsorted Index start from 1 left to right
                int lastUnsortedIndex = arra.length - 1;
                while (unsortedIndex <= lastUnsortedIndex) {
                    System.out.println("Insertion Sort Outer loop");
                    int newElement = arra[unsortedIndex];
                    int i;
                    for (i = unsortedIndex; i >= 0 && arra[i - 1] > newElement; i--) {
                        System.out.println("Insertion Sort Inner loop");
                        arra[i] = arra[i - 1];
                    }
                    arra[i] = newElement;
                    unsortedIndex++;
                }
            }
            gap = Math.round(gap/2);
        }

    }
}

public class ShellSortAscMian { // driver class main
    public static void main(String[] args) {

        int[] arri = {20, 35, -15, 7, 55, 1, -22};
        ShellSortAsc ssai = new ShellSortAsc(arri);
        ssai.shellSort();
        ssai.printArray();

    }
}
