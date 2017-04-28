// Необходимо найти ошибки

public class Task5 {

    /**
     * Увеличивающий поток
     */
    static Thread firstThread = new Thread(() -> {
        Singleton singleton = Singleton.getInstance();
        while (true) {
            synchronized (singleton.firstCount) {
                // блокирует первый счетчик и увеличиваем второй
                singleton.secondCount++;
            }
        }
    });

    /**
     * Уменьшющий поток
     */
    static Thread secondThread = new Thread(() -> {
        Singleton singleton = Singleton.getInstance();
        while (true) {
            synchronized (singleton.secondCount) {
                // блокируем второй сетчик и увеличиваем первый
                singleton.firstCount--;
            }
        }
    });

    public static void main(String[] args) {
        firstThread.run(); // запускает первый поток
        secondThread.run(); // запускаем второй поток
    }
}

/**
 * Общие на приложение счетчики
 */
class Singleton {
    private Singleton() {}

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Счетчики
     */
    public int firstCount = 0, secondCount = 0;
}
