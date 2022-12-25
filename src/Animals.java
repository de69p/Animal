import java.util.Random;

public class Animals {
    protected String name;
    protected String type;
    protected int maxRun;

    protected int maxSwim;
    protected static int animalsCount;
    Random random = new Random();

    public Animals(String name){
        this.name = name;
        animalsCount++;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
    }

    protected static int getAnimalsCount(){
        return animalsCount;
    }
}
