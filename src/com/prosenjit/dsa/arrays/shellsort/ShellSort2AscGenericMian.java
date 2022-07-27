package com.prosenjit.dsa.arrays.shellsort;

class ShellSort2GenericAsc<T extends Number & Comparable<? super T>> {

    T[] arra; //Defining the data

    //Defining the constructor
    ShellSort2GenericAsc(T[] x) {
        this.arra = x;
    }

    //Method to print the array
    void printArray() {
        for (T a : arra) {
            System.out.println(a);
        }
    }

    void shellSort() {
        /*
        This Shell Sort implementation is better than the other one i.e., ShellSortAscMain
        Before entering into Insertion sort, Shell Sort does some premiminary work so there will be less loop than
        Insertion Sort. Shell Sort start at larger sort value. As the algorithm progress gap is reduced. Goal is to
        reduce the amount of shifting required. There rea tons of gap value and most used one is Knuth's theory which
        says (3**k - 1)/2 is the gap value. K value will be such so that result of expression will be close but less
        than the array lenght. But for simplicity I have used array.length/2 as gap value. We keep reducing the gap
        value till it becomes 1. Once we reach one we peform the Insertion Sort will remaining Unsorted value. But the
        time we got to Insertion sort, the array has been partially sorted.
         */
        // for this implementation I am using Gap N/2. But the Kunth theory is most common (3**k - 1)/2
        // in each iteration gap will be gap/2 till it does not become 1

        for (int gap = arra.length/2; gap > 0; gap /= 2) { // this is loop for the gap

            //left to right loop for unsorted array. Till the gap is 1 we do some preliminary work
            for (int i = gap; i < arra.length; i++) {
                T newElement = arra[i];

                int j = i;

                while (j >= gap && arra[j-gap].compareTo(newElement) > 0) { //if j>=gap and element in j-gap > newElement, do the insertion
                    arra[j] = arra[j-gap]; //making the space at j-gap
                    j-= gap; //now j become j-gap
                }
                //insert the element as insertion sort in previous j-gap which is current j position after above iteration
                arra[j] = newElement; //insert the element as insertion sort in previous j-gap which is current j position
            }
        }
    }
}

public class ShellSort2AscGenericMian { // driver class main
    public static void main(String[] args) {

        System.out.println("********* Integer Array **********");
        Integer[] arri = {20, 35, -15, 7, 55, 1, -22};
        ShellSort2GenericAsc<Integer> ssai = new ShellSort2GenericAsc<>(arri);
        ssai.shellSort();
        ssai.printArray();

        System.out.println("********* Float Array **********");
        Float[] arrf = {20.2f, 35.3f, -15.1f, 7.0f, 55.0f, 1.1f, -22.2f};
        ShellSort2GenericAsc<Float> ssaf = new ShellSort2GenericAsc<>(arrf);
        ssaf.shellSort();
        ssaf.printArray();


        System.out.println("********* Double Array **********");
        Double[] arrd = {203.2, 353.2, -151.2, 70.0, 552.0, 11.1, -22.2};
        ShellSort2GenericAsc<Double> ssad = new ShellSort2GenericAsc<>(arrd);
        ssad.shellSort();
        ssad.printArray();

    }
}
