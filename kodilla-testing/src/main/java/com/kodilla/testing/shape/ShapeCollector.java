package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    public List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(0);
    }

    public void showFigures() {
        for(Shape shape: shapes) {
            System.out.println(shape);
        }
    }

    public int size() {
        return shapes.size();
    }
}
