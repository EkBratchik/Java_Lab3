package com.bsu;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите любое слово или фразу: ");
            String phrase1 = sc.nextLine();
            System.out.println(phrase1);

            Scanner k = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = k.nextInt();

            String formattedText = remove_first_words(phrase1, num);

            System.out.println("****************");
            System.out.print(formattedText);
        }

        public static String remove_first_words(String text, int count){
            StringBuilder newText = new StringBuilder();
            for (String line : text.split("\n")) {
                String[] allWords = line.split(" ");

                if (allWords.length <= count) {
                    continue;
                }

                String[] neededWords = Arrays.copyOfRange(allWords, count, allWords.length);
                newText.append(String.join(" ", neededWords));
                newText.append("\n");
            }
            return newText.toString();
        }

    }


