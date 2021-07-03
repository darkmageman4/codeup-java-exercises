package shapes;
//Square extend Quadrilateral
public class Square extends Quadrilateral{
    public Square(int length, int width) {
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

//(copying) Extending Class to Rectangle
//public class Square extends Rectangle{
//
//    //Constructor accepting one argument
//    public Square(int side){
//
//        super(side, side);
//        //Calling area from parent
//        getArea(side);
//        //Calling Perimeter from parent
//        getPerimeter(side);
//
//    }
//
//    //Overriding can only be done if super class have already created its method
//
//    //Overriding Rectangle.area
//    public int getArea(int side){
//        return 4 * side;
//
//    }
//
//    //Overriding Rectangle.area
//    public int getPerimeter (int side){
//        //Math.pow exponents (base,exponent) ex.Squares = 2
//        return (int)Math.pow(side,2);
//    }


}
