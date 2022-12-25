public class Dog extends Animals {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = random.nextInt(500);
        this.maxSwim = random.nextInt(10);
    }
}
