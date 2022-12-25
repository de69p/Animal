public class Cat extends Animals {
    public Cat(String name) {
        super(name);
        this.type = "Cat";
        this.maxRun = random.nextInt(200);
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cats can't swim!");
    }
}

