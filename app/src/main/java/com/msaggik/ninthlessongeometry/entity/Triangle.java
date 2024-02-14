package com.msaggik.ninthlessongeometry.entity;

public class Triangle extends Figure {

    public Triangle(int color, int height, int width) {
        super(color, height, width);
    }

    // вычисление площади фигуры
    @Override
    public int figureArea(int width, int height) {
        return width * height / 2;
    }

    // вычисление периметра фигуры (прямоугольный треугольник)
    @Override
    public int figurePerimeter(int width, int height) {
        return (int) (Math.sqrt(width * width + height * height) + width + height);
    }
}