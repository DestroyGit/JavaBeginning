package CatAndPlate;

public class Plate {
    private int volume;

    public Plate(int volume) {
        this.volume = volume;
    }

    public void infoPlate(Cat cat){

        if (volume >= cat.getAppetite()){
            cat.eating(volume - cat.getAppetite());
            volume -=cat.getAppetite();

        }
        else{
            cat.eating(volume - cat.getAppetite());
        }
        System.out.println("В тарелке осталось: " + volume);
    }

    public void infoPlate(){
        System.out.println("В тарелке осталось: " + volume);
    }

    public void setVolume(int volume) {
        this.volume += volume;
        System.out.printf("В тарелку добавили %d еды, теперь там %d еды\n", volume, this.volume);
    }
}
