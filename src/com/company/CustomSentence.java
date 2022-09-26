package com.company;

final public class CustomSentence {

    private final String text;
    private String reversingWord;

    private String changingWord;
    private String addingLetters;

    private final char[] charArray;

    public CustomSentence(String sentence) {
        this.text = sentence;
        charArray = this.text.toCharArray();
    }

    public void getReversingWord(String reversingWord) {
        this.reversingWord = reversingWord;
        reverseString(this);
    }

    public void getChangingWord(String changingWord) {
        this.changingWord = changingWord;
    }

    public void getAddingLetters(String addingLetters) {
        this.addingLetters = addingLetters;
    }

    public static void appendLetters(CustomSentence sentence) {

        StringBuilder newWord = new StringBuilder(sentence.changingWord);
        if (newWord.length() % 2 == 0) {
            newWord.insert(newWord.length() / 2, sentence.addingLetters);
        } else {
            newWord.deleteCharAt(newWord.length() / 2);
            newWord.insert(newWord.length() / 2, sentence.addingLetters);
        }

        System.out.println(sentence.text.replace(sentence.changingWord, newWord));
    }

    public void calculateUpperCasedWords() {
        int countOfUpperCaseWords = 0;
        for(char i:charArray){
            if(Character.isUpperCase(i)){
                countOfUpperCaseWords += 1;
            }
        }
        System.out.println("Count of upper case words = " + countOfUpperCaseWords);
    }

    public static void reverseString(CustomSentence sentence) {
        System.out.println(sentence.text.replace(
                sentence.reversingWord,
                new StringBuilder(sentence.reversingWord).reverse().toString())+"\n"
        );
    }
}
