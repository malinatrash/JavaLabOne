package com.company;

final public class CustomSentence {

    String text;
    String reversingWord;
    String reversedWord;

    String changingWord;
    String addingLetters;

    private char[] charArray;

    public CustomSentence() {
        text = "";
        reversedWord = "";
        reversingWord = "";
        changingWord = "";
        addingLetters = "";
        charArray = this.text.toCharArray();
    }

    public CustomSentence(String sentence, String reversingWord, String reversedWord) {
        this.text = sentence;
        this.reversedWord = reversedWord;
        this.reversingWord = reversingWord;
    }

    public CustomSentence(String sentence) {
        this.text = sentence;
        this.reversedWord = "";
        this.reversingWord = "";
        charArray = this.text.toCharArray();
    }

    public static StringBuilder appendLetters(String changingWord, String addingLetters) {

        StringBuilder newWord = new StringBuilder(changingWord);
        if (newWord.length() % 2 == 0) {
            newWord.insert(newWord.length() / 2, addingLetters);
        } else {
            newWord.deleteCharAt(newWord.length() / 2);
            newWord.insert(newWord.length() / 2, addingLetters);
        }
        return newWord;
    }

    public int calculateUpperCasedWords() {
        int countOfUpperCaseWords = 0;
        for(char i:charArray){
            if(Character.isUpperCase(i)){
                countOfUpperCaseWords += 1;
            }
        }
        return countOfUpperCaseWords;
    }


    public static String reverseString(CustomSentence sentence) {
        return new StringBuilder(sentence.reversingWord).reverse().toString();
    }
}
