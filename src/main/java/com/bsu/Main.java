package com.bsu;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите любое слово или фразу: ");
            String phrase1 = sc.nextLine();
            System.out.println(phrase1);

            String test_text = "qwe kjfd qwe qwe\nasd asd\nzxc kfdjsklfj zxc";
            System.out.println(test_text);
            System.out.println("****************");

            Scanner k = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = k.nextInt();

            String formatted_text = remove_first_words(phrase1, num);
            String formatted_text2 = remove_first_words(test_text, num);

            System.out.println("****************");
            System.out.print(formatted_text);
            System.out.println("****************");
            System.out.println(formatted_text2);

        }

        public static String remove_first_words(String text, int count){
            StringBuilder new_text = new StringBuilder();
            for (String line : text.split("\n")) {
                String[] all_words = line.split(" ");

                if (all_words.length <= count) {
                    continue;
                }

                String[] needed_words = Arrays.copyOfRange(all_words, count, all_words.length);
                new_text.append(String.join(" ", needed_words));
                new_text.append("\n");
            }
            return new_text.toString();
        }

    }


