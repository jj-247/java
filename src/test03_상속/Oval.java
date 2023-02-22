package test03_상속;

public class Oval implements Shape {

    private int width;
    private int height;

    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("%dx%d 사각형에 내접하는 타원 %n", width, height);
    }

    @Override
    public double getArea() {
        double oval = PI * width * height;
        return oval;
    }

}
