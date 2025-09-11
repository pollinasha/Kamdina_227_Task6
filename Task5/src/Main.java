public class Main {
    public static void main(String[] args) {
        Circle circle2 = new Circle();
        circle2.drawCircle();

        Square square2 = new Square();
        square2.drawSquare();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.drawRectangle();

        Ellipse ellipse2 = new Ellipse();
        ellipse2.drawCircle();
        ellipse2.circleToEllipse();
    }
}

class Figure {
    public void drawCircle() {
        System.out.println("Рисуем круг");
    }

    public void drawSquare() {
        System.out.println("Рисуем квадрат");
    }

    public void drawRectangle() {
        System.out.println("Рисуем прямоугольник");
    }
}

class Circle extends Figure {
}

class Square extends Figure{
}

class Rectangle extends Figure{
}

class Ellipse extends Figure{
    public void circleToEllipse() {
        System.out.println("Превращаем круг в овал");
    }
}