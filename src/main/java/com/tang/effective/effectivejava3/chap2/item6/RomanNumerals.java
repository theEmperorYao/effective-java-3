package com.tang.effective.effectivejava3.chap2.item6;


import java.util.regex.Pattern;

/**
 * @Title: RomanNumerals
 * @Description:
 * @author: tangyao
 * @date: 2022/4/2 10:49
 * @Version: 1.0
 */

public class RomanNumerals {


    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {

        long start = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
//            boolean a = isRomanNumeralSlow("III");
            boolean iii = isRomanNumeral("III");
        }
        long end1 = System.nanoTime();

        System.out.println((end1 - start) / 1_000_000 + " msecs");


    }
}