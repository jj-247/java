package test03_상속;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("반지름이 %d 인 원입니다 %n", radius);
    }

    @Override
    public double getArea() {
        double circle = PI * radius * radius;
        return circle;
    }

}
