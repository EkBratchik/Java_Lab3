package com.bsu;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.bsu.Main.removeFirstWords;


public class Testing {
    @Test
    public void testMain() {
        String text = "qwe kjfd qwe qwe\nasd asd\nzxc kfdjsklfj zxc";
        int num = 1;

        String formattedText = removeFirstWords(text, num);
        assertEquals(text, formattedText);
    }
}
