package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n1 – do first task");
            System.out.println("2 – do second task");
            System.out.println("3 – do third task");
            System.out.println("4 – do fourth task");
            System.out.println("5 – exit\n");

            int choice = in.nextInt();

            if (choice == 1) {
                doTaskOne();
            } else if (choice == 2) {
                doTaskTwo();
            } else if (choice == 3) {
                doTaskThree();
            } else if (choice == 4) {
                doTaskFour();
            } else {
                break;
            }
        }
        in.close();
    }
    public static void doTaskOne() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the array size - ");
        int arraySize = in.nextInt();
        int[] arrayOfNumbers = new int[arraySize];

        fillArray(arrayOfNumbers);

        System.out.println("\nEnter the value of new element in array");
        int valueOfElement = in.nextInt();

        System.out.println("\nEnter the index of new element in array");
        int placeOfElement = in.nextInt();

        int[] newArray;
        newArray = insertElement(arraySize, arrayOfNumbers, valueOfElement, placeOfElement);
        System.out.println("Initial Array:\n" + Arrays.toString(newArray));




    }

    public static int[] fillArray(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        return array;
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
    public static void doTaskTwo() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the sentence:\n");
        String sentence = in.nextLine();

        System.out.println("\nEnter the word which you want to reverse:\n");
        String reversingWord = in.nextLine();

        String reversedWord = reverseString(reversingWord);

        System.out.println(sentence.replace(reversingWord, reversedWord)+"\n");

    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static void doTaskThree() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the sentence:\n");
        String sentence = in.nextLine();

        System.out.println("\nEnter the word which you want to change:\n");
        String changingWord = in.nextLine();

        System.out.println("\nEnter the letters which will added:\n");
        String addingLetters = in.nextLine();

        StringBuilder newWord = new StringBuilder(changingWord);
        if (newWord.length() % 2 == 0) {
            newWord.insert(newWord.length() / 2, addingLetters);
        } else {
            newWord.deleteCharAt(newWord.length() / 2);
            newWord.insert(newWord.length() / 2, addingLetters);
        }

        System.out.println(sentence.replace(changingWord, newWord));
    }

    public static void doTaskFour() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the sentence:\n");

        String sentence = in.nextLine();
        char[] charArray = sentence.toCharArray();

        int countOfUpperCaseWords = 0;
        for(char i:charArray){
            if(Character.isUpperCase(i)){
                countOfUpperCaseWords += 1;
            }
        }
        System.out.println("Count of upper case words = " + countOfUpperCaseWords);
    }
}
