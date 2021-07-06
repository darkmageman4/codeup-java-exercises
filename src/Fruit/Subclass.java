package Fruit;

public class Subclass extends Fruit{
    public static void main(String[] args) {
        //instance
        Subclass Mango = new Subclass();
        Mango.color = "green";
        System.out.println("Ripe mangos are " + Mango.color);

        Subclass Peach = new Subclass();
        Peach.size = "small";
        System.out.println("Peaches are " + Peach.size);

        Subclass Plump = new Subclass();
        Plump.shape = "circular";
        System.out.println("Plumps are " + Plump.shape);

        Subclass Apple = new Subclass();
        System.out.println(Apple.fruit());



    }
}
