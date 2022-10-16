package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

final public class CustomArray {
    private int [] array;
    private int length;
    private int newElementIndex;
    private int newElementValue;

    public CustomArray(int length) {
        this.length = length;
        this.array = new int[this.length];
    }

    public CustomArray(int[] array) {
        this.setArray(array);
    }

    public CustomArray() {
        this(10);
        this.newElementValue = 5;
        this.newElementIndex = 0;
        this.setRandom();
    }

    public CustomArray(CustomArray object) {
        this.length = object.length;
        this.array = new int[this.length];
        this.newElementValue = object.newElementValue;
        this.newElementIndex = object.newElementIndex;
        fillArray();
    }

    public void setRandom() {
        Random r = new Random();
        for (int i = 0; i < this.length; i++) {
            this.array[i] = r.nextInt(11) - 5;
        }
    }

    public int[] getArray() {
        return this.array;
    }

    public void setValue(int number) {
        this.newElementValue = number;
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
        this.length = array.length;
    }

    public void setIndex(int index) {
        this.newElementIndex = index;
    }

    public void fillArray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < this.array.length; i++) {
            System.out.print("["+(i+1)+"]"+" элемент = ");
            this.array[i] = in.nextInt();
        }
    }

    public void printArray() {
            for (int i = 0; i < this.array.length; i++) {
                System.out.print("["+(i+1)+"]"+" элемент = " + array[i] + "\n");
            }
    }

    public void insertElement() {
        int[] newArray = new int[this.length + 1];
        for (int i = 0; i < this.length + 1; i++) {
            if (i < this.newElementIndex - 1) {
                newArray[i] = this.array[i];
            }
            else if (i == this.newElementIndex - 1) {
                newArray[i] = this.newElementValue;
            }
            else {
                newArray[i] = this.array[i - 1];
            }
        }
        System.out.println("\nИтоговый массив целых чисел:\n" + Arrays.toString(newArray));
    }
}
