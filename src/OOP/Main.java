package OOP;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Vaska");
        Animal cat2 = new Cat ("Murzik");
        Animal dog1 = new Dog("Bobik");
        Animal dog2 = new Dog ("Tuzik");
        Animal dog3 = new Dog ("Pushok");

        cat1.run(250);
        cat2.run(10);
        cat1.swim(1);
        dog3.swim(9);
        dog1.run(39);
        dog2.swim(11);

        System.out.printf("Животных: %d\n", Animal.count);
        System.out.printf("Котов: %d\n", Cat.count);
        System.out.printf("Собак: %d\n", Dog.count);
    }

}
