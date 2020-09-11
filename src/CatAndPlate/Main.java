package CatAndPlate;

public class Main {
    public static void main(String[] args) {

        Cat [] cats = {
                new Cat("Baks", 15),
                new Cat("Murzik", 12),
                new Cat("Nikita", 30),
                new Cat("Busik", 8),
                new Cat("Koks", 25)
        };

        Plate plate = new Plate (50);

        plate.infoPlate(); // сколько в тарелке еды
        eat(cats, plate); //кормим котов
        plate.setVolume(70); //наполняем миску на это количество
        System.out.println(); //для читабельности консоли
        eat(cats, plate); //кормим котов после наполнения миски

    }

    static void eat(Cat [] cats, Plate plate){
        for (int i = 0; i < cats.length; i++) {
            plate.infoPlate(cats[i]);
        }
    }
}
