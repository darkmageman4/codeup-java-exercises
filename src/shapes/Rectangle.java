package shapes;

//Ractangle extend to Quadrilateral implement Measurable
public class Rectangle extends Quadrilateral implements Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
//    //Protected properties
//    protected int length;
//    protected int width;
//
//    // constructor that accepts two number
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    //methods
//    public int getlength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public int getArea() {
//        return this.length * this.width;
//    }
//
//    public int getPerimeter() {
//        return 2 * (this.length + this.width);
//    }


}
