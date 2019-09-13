package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String one, String two, PoemDecorator poemDecorator) {
        String decoratedBeauty = poemDecorator.decorate(one, two);
        System.out.println(decoratedBeauty);

    }
}
