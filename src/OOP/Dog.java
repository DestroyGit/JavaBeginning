package OOP;

public class Dog extends Animal {
    static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    void run(int n) {
        super.run(n);
        if (n >= 0 || n <= 500) {
            System.out.printf("%s пробежал %d метров\n", name, n);
        } else
            System.out.printf("%s не может пробежать %d метров\n", name, n);

    }

    @Override
    void swim(int n) {
        super.swim(n);
        if (n >= 0 && n <= 10) {
            System.out.printf("%s проплыл %d метров\n", name, n);
        } else
            System.out.printf("%s не может проплыть %d метров\n", name, n);
    }

}
