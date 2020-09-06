package OOP;

public class Cat extends Animal {
    static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    void run(int n) {
        super.run(n);
        if (n >= 0 && n <= 200) {
            System.out.printf("%s пробежал %d метров\n", name, n);
        } else
            System.out.printf("%s не может пробежать %d метров\n", name, n);
    }

    @Override
    void swim(int n) {
        super.swim(n);
        System.out.printf("%s не умеет плавать\n", name);
    }

}
