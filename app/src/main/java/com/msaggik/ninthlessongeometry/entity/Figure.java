package com.msaggik.ninthlessongeometry.entity;

public abstract class Figure {
    // поля
    private int color; // цвет
    private int height; // высота
    private int width; // ширина

    // метод определяющий площадь описываемого вокруг фигуры квадрата
    public int describedArea(int width, int height) {
        if (width > height) {
            return width * width;
        } else {
            return height * height;
        }
    }

    // абстрактные методы
    public abstract int figureArea(int width, int height); // площадь фигуры
    public abstract int figurePerimeter(int width, int height); // периметр фигуры

    // конструктор
    public Figure(int color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    // геттеры и сеттеры
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
