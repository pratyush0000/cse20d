package classbasics;

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Equilateral extends Triangle{
    public void area(int l, int h){
        System.out.println("Area of Eq Triangle = " + 0.5*l*h);
    }
}

public class MultiLevelInheritence {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(); // Calls area() of Shape

        Triangle triangle = new Triangle();
        triangle.area(5, 10); // Calls area() of Triangle

        Equilateral realtriangle = new Equilateral();
        realtriangle.area(10,20); // area of Equilateral

    }
}
