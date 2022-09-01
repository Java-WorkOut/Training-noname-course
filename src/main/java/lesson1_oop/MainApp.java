package lesson1_oop;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "White", 2);
        Cat cat2 = new Cat("Murzik", "Black", 4);

        cat.info();
        cat2.info();

        new MainApp().doSomething();
    }

    public void doSomething() {
        System.out.println("1");
    }
}
