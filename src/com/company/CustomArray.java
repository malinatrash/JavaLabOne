package com.company;
import java.util.Scanner;

final public class CustomArray {
    public int [] array;
    public int length;
    public int newElementIndex;
    public int newElementValue;

    public CustomArray(int length) {
        this.length = length;
        this.array = new int[this.length];
    }

    public void fillArray(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }

    public static int[] insertElement(int sizeOfArray, int[] array, int element, int position) {
        int[] newArray = new int[sizeOfArray + 1];
        for (int i = 0; i < sizeOfArray + 1; i++) {
            if (i < position - 1) {
                newArray[i] = array[i];
            }
            else if (i == position - 1) {
                newArray[i] = element;
            }
            else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }
}
