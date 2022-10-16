package com.company;

import java.util.Random;
import java.util.Scanner;

final public class CustomSentence {

    private final String text;
    private String reversingWord;

    private String changingWord;
    private String addingLetters;

    private final char[] charArray;


    public CustomSentence() {
        this.text = setRandomSentence(5) + " " + setRandomSentence(2) + " " + setRandomSentence(7);
        charArray = this.text.toCharArray();
    }


    public CustomSentence(String sentence) {
        this.text = sentence;
        charArray = this.text.toCharArray();
    }

    public String getText() {
        return this.text;
    }

    public void setReversingWord(String word) {
        this.reversingWord = word;
        reverseString();
    }

    public String setRandomSentence(int size) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }

    public void setChangingWord(String changingWord) {
        this.changingWord = changingWord;
    }

    public void setAddingLetters(String addingLetters) {
        this.addingLetters = addingLetters;
    }

    public void appendLetters() {

        StringBuilder newWord = new StringBuilder(this.changingWord);
        if (newWord.length() % 2 == 0) {
            newWord.insert(newWord.length() / 2, this.addingLetters);
        } else {
            newWord.deleteCharAt(newWord.length() / 2);
            newWord.insert(newWord.length() / 2, this.addingLetters);
        }
        System.out.print("\nРезультат: ");
        System.out.println(this.text.replace(this.changingWord, newWord));
    }

    public void calculateUpperCasedWords() {
        int countOfUpperCaseWords = 0;
        for(char i:charArray){
            if(Character.isUpperCase(i)){
                countOfUpperCaseWords += 1;
            }
        }
        System.out.println("Количество заглавных букв в строке - " + countOfUpperCaseWords);
    }

    public void reverseString() {
        System.out.println(this.text.replace(
                this.reversingWord,
                new StringBuilder(this.reversingWord
                ).reverse().toString())+"\n"
        );
    }
}
