package com.company;
import java.util.Arrays;
import java.util.Scanner;



final public class Main {

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
        CustomArray customArray = new CustomArray(in.nextInt());

        customArray.fillArray(customArray.array);

        System.out.println("\nEnter the value of new element in array");
        customArray.newElementValue = in.nextInt();

        System.out.println("\nEnter the index of new element in array");
        customArray.newElementIndex = in.nextInt();

      customArray.array = CustomArray.insertElement(
              customArray.length,
              customArray.array,
              customArray.newElementValue,
              customArray.newElementIndex
      );
        System.out.println("Initial Array:\n" + Arrays.toString(customArray.array));
    }

    public static void doTaskTwo() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the sentence:\n");
        CustomSentence sentence = new CustomSentence(in.nextLine());

        System.out.println("\nEnter the word which you want to reverse:\n");
        sentence.reversingWord = in.nextLine();

        sentence.reversedWord = CustomSentence.reverseString(sentence);

        System.out.println(sentence.text.replace(sentence.reversingWord, sentence.reversedWord)+"\n");
    }


    public static void doTaskThree() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the sentence:\n");
        CustomSentence sentence = new CustomSentence(in.nextLine());

        System.out.println("\nEnter the word which you want to change:\n");
        sentence.changingWord = in.nextLine();

        System.out.println("\nEnter the letters which will added:\n");
        sentence.addingLetters = in.nextLine();

        System.out.println(sentence.text.replace(
                sentence.changingWord,
                CustomSentence.appendLetters(
                        sentence.changingWord,
                        sentence.addingLetters
                )
        ));
    }

    public static void doTaskFour() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the sentence:\n");
        CustomSentence sentence = new CustomSentence(in.nextLine());

        System.out.println("Count of upper case words = " + sentence.calculateUpperCasedWords());
    }
}
