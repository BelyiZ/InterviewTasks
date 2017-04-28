// Что будет если скомпилировать и запустить этот код?

public class Task3 {
    public static void main(String[] args) {
        new Котопёс();
    }
}

class Кот {
    public Кот() {
        проситьЕду();
        проситьГулять();
    }

    void проситьЕду() {
        System.out.println("Мяу-мяу");
    }

    static void проситьГулять() {
        System.out.println("Мяу-мяу-мау");
    }
}

class Котопёс extends Кот {
    public Котопёс() {}

    void проситьЕду() {
        System.out.println("Гавмяу!");
    }

    static void проситьГулять() {
        System.out.println("Гавмяу! Гавмяу!");
    }
}
