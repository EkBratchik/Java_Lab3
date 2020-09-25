package com.bsu;

import org.junit.Test;

import static com.bsu.Main.removeFirstWords;


public class Testing {
    @Test
    public void testMain() {
        String text = "qwe kjfd qwe qwe\nasd asd\nzxc kfdjsklfj zxc";
        System.out.println(text);

        System.out.println("****************");
        int num = 1;

        String formattedText = removeFirstWords(text, num);
        System.out.println("****************");
        System.out.print(formattedText);
    }
}
