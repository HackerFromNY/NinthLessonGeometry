package com.msaggik.ninthlessongeometry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.WithHint;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.msaggik.ninthlessongeometry.entity.Circle;
import com.msaggik.ninthlessongeometry.entity.Figure;
import com.msaggik.ninthlessongeometry.entity.Rectangle;
import com.msaggik.ninthlessongeometry.entity.Triangle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // поля
    private Figure rectangle, circle, triangle; // фигуры

    private int areaRectangle, areaCircle, areaTriangle; // площади

    private int perimeterRectangle, perimeterCircle, perimeterTriangle; // периметры
    private int widthIn, heightIn; // ширина и высота

    // дополнительные поля
    private EditText widthInput, heightInput;
    private Button button;
    private TextView infoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // связь полей представления с разметкой по id
        widthInput = findViewById(R.id.widthIn);
        heightInput = findViewById(R.id.heightIn);
        button = findViewById(R.id.button);
        infoApp = findViewById(R.id.infoApp);

        // обработаем нажатие кнопки
        button.setOnClickListener(listener);
    }

    // создадим слушатель кнопки и с помощью анонимного класса переопределим метод onClick(View view)
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // инициализация параметров ширины и длины
            widthIn = Integer.parseInt(widthInput.getText().toString());
            heightIn = Integer.parseInt(heightInput.getText().toString());


            // инициализация объектов фигур
            rectangle = new Rectangle(0xFF0000, heightIn, widthIn);
            circle = new Circle(0x00FF00, heightIn, widthIn);
            triangle = new Triangle(0x0000FF, heightIn, widthIn);
            Rectangle f = new Rectangle(0x0030FF, 23, 323);

            // инициализация площадей
            areaRectangle = rectangle.figureArea(rectangle.getWidth(), rectangle.getHeight());
            areaCircle = circle.figureArea(circle.getWidth(), circle.getHeight());
            areaTriangle = triangle.figureArea(triangle.getWidth(), triangle.getHeight());
            int Figurearea = f.figureArea(rectangle.getWidth(), rectangle.getHeight());


            // инициализация периметров
            perimeterRectangle = rectangle.figurePerimeter(rectangle.getWidth(), rectangle.getHeight());
            perimeterCircle = circle.figurePerimeter(circle.getWidth(), circle.getHeight());
            perimeterTriangle = triangle.figurePerimeter(triangle.getWidth(), triangle.getHeight());

            // вывод информации о геометрических фигурах на экран7
            infoApp.setText("Площадь прямоугольника " + areaRectangle + "\n"
                    + "Периметр прямоугольника " + perimeterRectangle + "\n\n"
                    + "Площадь круга " + areaCircle + "\n"
                    + "Периметр круга " + perimeterCircle + "\n\n"
                    + "Площадь треугольника " + areaTriangle + "\n"
                    + "Периметр треугольника " + perimeterTriangle + "\n\n"
            + "Говно какое - то: " + Figurearea);
        }
    };
}