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

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class HierarchialInheritence {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(); // Calls area() of Shape

        Triangle triangle = new Triangle();
        triangle.area(5, 10); // Calls area() of Triangle

        Circle circle = new Circle();
        circle.area(10);
    }
}
