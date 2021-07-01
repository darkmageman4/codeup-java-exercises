package oop.animals;

//class
public class Fish extends Marines {

    private boolean hasScales;

    //constructor
    public Fish(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, boolean hasScales) {
super(canSwim, length, finCount, isSaltWater, name);
        this.hasScales = hasScales;
    }

    public Fish (String name){
        super(name);
    }

    public Fish (){}

    //getAndSetters

    public boolean getHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
}