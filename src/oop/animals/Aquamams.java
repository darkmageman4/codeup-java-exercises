package oop.animals;

public class Aquamams extends Marines {

    private int maxTimeSubmerged;

    public Aquamams(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, int maxTimeSubmerged) {
        super(canSwim, length, finCount, isSaltWater, name);
        this.maxTimeSubmerged = maxTimeSubmerged;

    }

    public Aquamams(String name){
        super(name);
    };

    public Aquamams(){};

    public int getMaxTimeSubmerged(){
    return maxTimeSubmerged;
    }

    public void setMaxTimeSubmerged(int maxTimeSubmerged){
        this.maxTimeSubmerged = maxTimeSubmerged;
    }
}

