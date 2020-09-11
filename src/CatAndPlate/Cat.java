package CatAndPlate;

public class Cat {
    private String name;
    private int appetite;
    private static boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eating(int eatInPlate){
        if (eatInPlate >= 0){
            satiety = true;
            System.out.println(name + " съел " + appetite + ". Сытость: " + satiety);
        }
        else{
            satiety = false;
            System.out.println(name + " не поел" + ". Сытость: " + satiety);
        }
    }

    public int getAppetite() {
        return appetite;
    }
}
