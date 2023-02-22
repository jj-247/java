package test03_상속;

public class Rect implements Shape {

    private int width;
    private int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("%dx%d 크기의 사각형 %n", width, height);
    }

    @Override
    public double getArea() {
        double rect = width * height;
        return rect;
    }

}
