package shapes;
//abstract Quadrilateral extends Shape class
abstract class Quadrilateral implements Measurable{
    //properties/fields
    protected int length;
    protected int width;

    //constructors
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

//method for getting length
    public int getLength() {
        return length;
    }

    //abstract method for setting length
    public void setLength(int length) {
    }

    //method for getting width
    public int getWidth() {
        return width;
    }

    //abstract method for setting width
    public void setWidth(int width) {
    }
}
