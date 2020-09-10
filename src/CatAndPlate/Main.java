package CatAndPlate;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Baks", 15);
        Cat cat2 = new Cat("Murzik", 12);

        Plate plate = new Plate (50);

        cat1.eating();
        cat2.eating();
        plate.infoPlate();

    }
}
