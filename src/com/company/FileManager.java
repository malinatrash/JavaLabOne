package com.company;

import java.io.*;

public class FileManager {
    public static int[] arrayFromFile(String fileName) {
        int[] tempArray = null;
        try  (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int size = dis.readInt();
            tempArray = new int[size];
            for (int i = 0; i < size; i++) {
                tempArray[i] = dis.readInt();
            }
            System.out.println("Файл "+ fileName + " успешно прочитан");
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
        return tempArray;
    }

    public static void arrayToFile(int[] array, String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(array.length);
            for (int j : array) {
                dos.writeInt(j);
            }
            System.out.println("Успешно сохранено в  файл:" + fileName);

        } catch (FileNotFoundException e) {
            System.out.println("Некорректное имя файла");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла");
        }
    }

    public static void sentenceToTextFile(String text, String fileName) {
        StringBuilder str = new StringBuilder();
        try(BufferedWriter br = new BufferedWriter(new FileWriter(fileName))) {
            str.append(text);
            br.write(str.toString());
            System.out.println("\nУспешно сохранено в  файл:" + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи!");
        }
    }

    public static String sentenceFromTextFile(String fileName) {
        String sentence = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            sentence = br.readLine();
            System.out.println("Файл " + fileName + " успешно прочитан");
        } catch (IOException e) {
            System.out.println("Ошибка чтения!");
        }
        return sentence;
    }

}
