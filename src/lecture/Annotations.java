package lecture;
//1-10 random number generator
//int randomNum = (int) (Math.random()*10);


class Red {
    public void show() {
        System.out.println("I am red");
    }
}

class Orange extends Red {
    public void show() {
        System.out.println("I am orange");
    }
}

public class Annotations {
    public static void main(String[] args) {
        //objects
        Red redObj = new Red();
        Orange orjObj = new Orange();
        redObj.show();
        orjObj.show();
    }

}
