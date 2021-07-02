package shapes;

import oop.animals.Marines;

public class Rectangle {
    //Protected properties
    protected int length;
    protected int width;

    // constructor that accepts two number
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //methods
    public int getlength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return 2 * (this.length + this.width);
    }


}
