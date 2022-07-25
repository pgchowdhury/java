package com.prosenjit.dsa.arrays.bubblesort;

/*
this is a genric class with bound by Number. So that this call will accept any type o array which is Number type like
Integer, Float, Double, Long.
 */
class BubbleSortGeneric <T extends Number & Comparable<? super T>>   {
    T[] arra;

    BubbleSortGeneric(T[] arr) {

        this.arra = arr;
    }

    public void swap(T[] arr, int i, int j) {
        if (i == j){
            return;
        }
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public T[] bsort() {
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
        int i =0;
        while (i < unSortedArray){
            for (int j=0; j <= unSortedArray; j++){
                if ((j < unSortedArray) && (arra[j].compareTo(arra[j+1]) > 0)) {
                    swap (arra, j , j+1);
                }
            }
            unSortedArray--;
        }
        return arra;
    }

    public void print(T[] arr) {
        /*
        This method to print the generic arrays
         */
        for (T a : arr) {
            System.out.println(a);
        }
    }
}

public class BubbleSortMainGeneric <T extends Number> {

    public static void main(String[] args) {


        System.out.println("******************* Integer Implementation **********************");

        Integer[] arrs = {20,35,-15,7,55,1,-22, 10, 24, -98, 128, -123};

        BubbleSortGeneric<Integer> bsti = new BubbleSortGeneric<>(arrs);
        Integer[] sortedArrayi;
        sortedArrayi = bsti.bsort();
        bsti.print(sortedArrayi);

        System.out.println("******************** Float Implementation  *********************");

        Float[] arrf = {20.1f, 35.0f, -15.0f, 7.0f, 55.0f, 1.0f, -22.0f, 10.0f, 24.0f, -98.0f, 128.0f, -123.0f};

        BubbleSortGeneric<Float> bstf = new BubbleSortGeneric<>(arrf);
        Float[] sortedArrayf;
        sortedArrayf = bstf.bsort();
        bstf.print(sortedArrayf);

        System.out.println("******************** Double Implementation *********************");

        Double[] arrd = {20.1, 35.0, -15.0, 7.0, 55.0, 1.2, -22.7, 10.6, 24.0, -98.9, 128.0, -123.2};

        BubbleSortGeneric<Double> bstd = new BubbleSortGeneric<>(arrd);
        Double[] sortedArrayd;
        sortedArrayd = bstd.bsort();
        bstd.print(sortedArrayd);

        System.out.println("******************** Long Implementation *********************");

        Long[] arrl = {20L, 35L, -15L, 7L, 556567L, 15436L, -22L, 10000L, 24456L, -98L, 128L, -123L};

        BubbleSortGeneric<Long> bstl = new BubbleSortGeneric<>(arrl);
        Long[] sortedArrayl;
        sortedArrayl = bstl.bsort();
        bstl.print(sortedArrayl);
    }

}
