// package classbasics;

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h); // Corrected calculation
    }
}

public class SingleLevelInheritence {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(); // Calls area() of Shape

        Triangle triangle = new Triangle();
        triangle.area(5, 10); // Calls area() of Triangle
    }
}
