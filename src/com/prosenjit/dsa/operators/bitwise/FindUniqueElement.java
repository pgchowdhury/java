package com.prosenjit.dsa.operators.bitwise;

/*
* Here we will find the unique element of array. To find that we will use XOR (^).  XOR means if and only if. When both
* the element are same then the XOR results 0 or else 1.
* And we will use following properties of XOR:
* 1. Associative : (a * b) * c = (a * c) * b
* 2. Commutative : a + b = B + c OR a * b = b * a
* 3. XOR work as following table:
*    a      b     a ^ b
*    1      0       1
*    0      0       0
*    0      1       1
*    1      1       0
*   now we will find the unique element of a given array. to find that we will XOR the array element, it will return the
*  unique  element and other same duplicate element will become 0
 */

public class FindUniqueElement {

    int[] arr;

    public FindUniqueElement(int[] x) {
        this.arr = x;
    }

    int findUniqueElements() {
        int xorElement = 0;
        for (int element : arr) {
            xorElement ^= element;
        }
        return xorElement;
    }

    public static void main(String[] args) {
        // my array to find the unique one
        int[] arrs = {2,4,2,6,4,3,6};

        FindUniqueElement fue = new FindUniqueElement(arrs);

        System.out.println("Unique element is " + fue.findUniqueElements());

    }


}
