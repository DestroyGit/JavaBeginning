package CatAndPlate;

public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eating(){
        System.out.println(name + " ate " + appetite);
    }
}
