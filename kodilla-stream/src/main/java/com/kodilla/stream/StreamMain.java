package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("A", "", (one, two) -> "Battery type: " + one + one);
        poemBeautifier.beautify("triple", "A", (one, two) -> "Battery type: " + one + "-" + two);
        poemBeautifier.beautify("A", "b", (one, two) -> one.toLowerCase() + two.toUpperCase());
        poemBeautifier.beautify("!!!", "This sentence needed an adequate exclamation", (one, two) -> two + one);
        poemBeautifier.beautify("A", "B", (one, two) -> "So we can change one with two: " + one.replace('A', 'B'));
        poemBeautifier.beautify("A", "B", (one, two) -> "The two strings match: " + two.matches(one));
        poemBeautifier.beautify("Ala ma kota.", "A teraz juz nie ma ", (one, two) -> one + " " + two + one.substring(7));
    }
}
