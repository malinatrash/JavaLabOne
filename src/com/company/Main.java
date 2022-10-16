package com.company;
import java.util.Scanner;

final public class Main {
    public static void main(String[] args) {
        Menu.start();
    }
//        Scanner in = new Scanner(System.in);
//        while (true) {
//            System.out.println("\n1 – do first task");
//            System.out.println("2 – do second task");
//            System.out.println("3 – do third task");
//            System.out.println("4 – do fourth task");
//            System.out.println("5 – exit\n");
//            System.out.println("6 – test clone");
//
//            int choice = in.nextInt();
//
//            if (choice == 1) {
//                doTaskOne();
//            } else if (choice == 2) {
//                doTaskTwo();
//            } else if (choice == 3) {
//                doTaskThree();
//            } else if (choice == 4) {
//                doTaskFour();
//            } else {
//                break;
//            }
//        }
//    }
//    public static void doTaskOne() {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter the array size - ");
//        CustomArray customArray = new CustomArray(in.nextInt());
//
//        customArray.fillArray(customArray);
//
//        System.out.println("\nEnter the value of new element in array");
//        customArray.setValue(in.nextInt());
//
//        System.out.println("\nEnter the index of new element in array");
//        customArray.setIndex(in.nextInt());
//        customArray.insertElement(customArray);
//    }
//
//    public static void doTaskTwo() {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("\nEnter the sentence:\n");
//        CustomSentence sentence = new CustomSentence(in.nextLine());
//
//        System.out.println("\nEnter the word which you want to reverse:\n");
//        sentence.getReversingWord(in.nextLine());
//    }
//
//    public static void doTaskThree() {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("\nEnter the sentence:\n");
//        CustomSentence sentence = new CustomSentence(in.nextLine());
//
//        System.out.println("\nEnter the word which you want to change:\n");
//        sentence.getChangingWord(in.nextLine());
//
//        System.out.println("\nEnter the letters which will added:\n");
//        sentence.getAddingLetters(in.nextLine());
//
//        CustomSentence.appendLetters(sentence);
//    }
//
//    public static void doTaskFour() {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("\nEnter the sentence:\n");
//        CustomSentence sentence = new CustomSentence(in.nextLine());
//        sentence.calculateUpperCasedWords();
//    }
}
