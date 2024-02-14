package com.msaggik.ninthlessongeometry.entity;

public class Circle extends Figure{

    public Circle(int color, int height, int width) {
        super(color, height, width);
    }

    // вычисление площади фигуры
    @Override
    public int figureArea(int width, int height) {
        if (width < height) {
            int radius = width / 2;
            return (int) (Math.PI * radius * radius);
        } else {
            int radius = height / 2;
            return (int) (Math.PI * radius * radius);
        }
    }

    // вычисление периметра фигуры
    @Override
    public int figurePerimeter(int width, int height) {
        if (width < height) {
            int radius = width / 2;
            return (int) (2 * Math.PI * radius);
        } else {
            int radius = height / 2;
            return (int) (2 * Math.PI * radius);
        }
    }
}