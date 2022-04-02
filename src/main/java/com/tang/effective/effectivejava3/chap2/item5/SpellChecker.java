package com.tang.effective.effectivejava3.chap2.item5;


import java.util.List;

/**
 * @Title: SpellChecker
 * @Description:
 * @author: tangyao
 * @date: 2022/4/2 10:38
 * @Version: 1.0
 */

class Lexicon {
}

public class SpellChecker {

    private final Lexicon dictionary = null;

    private SpellChecker() {
    }

    public static SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word) {
        return false;
    }


    public List<String> suggestions(String typo) {
        return null;
    }
}