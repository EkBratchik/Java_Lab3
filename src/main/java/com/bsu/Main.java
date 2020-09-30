package com.bsu;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

        public static void main(String []args){
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Введите любое слово или фразу: ");
                String phrase1 = sc.nextLine();
                System.out.println(str);

                System.out.print("Введите k: ");
                int num = sc.nextInt();

                String formattedText = removeFirstWords(str, num);
                System.out.println("****************");
                System.out.print(formattedText);

            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
        }

        public static String removeFirstWords(String text, int count){
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


