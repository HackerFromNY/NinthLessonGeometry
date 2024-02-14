package com.msaggik.ninthlessongeometry.entity;

public class Rectangle extends Figure{

    public Rectangle(int color, int height, int width) {
        super(color, height, width);
    }

    // вычисление площади фигуры
    @Override
    public int figureArea(int width, int height) {
        return width * height;
    }

    // вычисление периметра фигуры
    @Override
    public int figurePerimeter(int width, int height) {
        return (width + height) * 2;
    }
}
