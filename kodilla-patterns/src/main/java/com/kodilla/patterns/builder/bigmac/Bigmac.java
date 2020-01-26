package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private static final String NBUN = "normal bun";
    private static final String SBUN = "sesame bun";
    private final String sauce;
    private static final String BBQSAUCE = "bbq sauce";
    private static final String STDSAUCE = "standard sauce";
    private static final String ISAUCE = "1000 islands sauce";
    private final int burgers;
    private final List<Ingredients> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private String sauce;
        private int burgers;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals(NBUN) || bun.equals(SBUN)) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("You have to chose between sesame bun or normal bun.");
            }
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(BBQSAUCE) || sauce.equals(STDSAUCE) || sauce.equals(ISAUCE)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Only three choices: standard, bbq or 1000  islands sauce.");
            }
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers > 0) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalArgumentException("It is not a vege burger.");
            }
        }

        public BigmacBuilder ingredients(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, sauce, burgers, ingredients);
        }

    }

    private Bigmac(final String bun, final String sauce, final int burgers, List<Ingredients> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun = '" + bun + '\'' +
                ", sauce = '" + sauce + '\'' +
                ", burgers = " + burgers +
                ", ingredients = " + ingredients +
                '}';
    }
}