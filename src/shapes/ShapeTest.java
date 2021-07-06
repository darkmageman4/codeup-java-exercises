package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        //instance of "box1" referencing Rectangle with 4,5 as parameters
//        Rectangle box1 = new Rectangle(4,5);

        Shape myShape;
        myShape = new Rectangle(4,5);;
        System.out.printf("Area: %s " , myShape.getArea());
        System.out.printf("\nPerimeter: %s " , myShape.getPerimeter());


        myShape = new Square(4,2);
        System.out.printf("Area: %s " , myShape.getArea());
        System.out.printf("\nPerimeter: %s " , myShape.getPerimeter());

        //instance of Rectangle class 5 as parameters
//        System.out.printf("length: %s " , box1.getlength());
//        System.out.printf("\nwidth: %s " , box1.getWidth());
//        System.out.printf("\nbo1 Area: %s " , box1.getArea());
//        System.out.printf("\nbo1 Perimeter: %s" , box1.getPerimeter());

        //instance of Square class 5 as parameters
//        Rectangle box2 = new Square(5);
//        System.out.printf("\nbo2 Area: %s ", box2.getArea());
//        System.out.printf("\nbo2 Perimeter: %s ", box2.getPerimeter());






    }
}
