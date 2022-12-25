public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Suleiman");
        Cat cat2 = new Cat("Pisik");

        Dog dog1 = new Dog("Archi");
        Dog dog2 = new Dog("Butuz");


        System.out.println();

        cat1.run(cat1.maxRun);
        cat1.swim(cat1.maxSwim);

        System.out.println();

        cat2.run(cat2.maxRun);
        cat2.swim(cat2.maxSwim);

        System.out.println();

        dog1.run(dog1.maxRun);
        dog1.swim(dog1.maxSwim);

        System.out.println();

        dog2.run(dog2.maxRun);
        dog2.swim(dog2.maxSwim);

        System.out.println();

        System.out.println("The total number of all animals is " + Animals.getAnimalsCount()  );
    }
}