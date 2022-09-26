package com.company;
import java.util.Arrays;
import java.util.Scanner;

final public class CustomArray {
    private final int [] array;
    private final int length;
    private int newElementIndex;
    private int newElementValue;

    public CustomArray(int length) {
        this.length = length;
        this.array = new int[this.length];
    }

    public void getValue(int value) {
        this.newElementValue = value;
    }

    public void getIndex(int index) {
        this.newElementIndex = index;
    }

    public void fillArray(CustomArray customArray) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < customArray.array.length; i++) {
            customArray.array[i] = in.nextInt();
        }
    }

    public void insertElement(CustomArray customArray) {
        int[] newArray = new int[customArray.length + 1];
        for (int i = 0; i < customArray.length + 1; i++) {
            if (i < customArray.newElementIndex - 1) {
                newArray[i] = customArray.array[i];
            }
            else if (i == customArray.newElementIndex - 1) {
                newArray[i] = customArray.newElementValue;
            }
            else {
                newArray[i] = customArray.array[i - 1];
            }
        }
        System.out.println("Initial Array:\n" + Arrays.toString(newArray));
    }
}
