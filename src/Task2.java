// Что будет если скомпилировать и запустить этот код?
// Как починить? Почему именно так?

public class Task2 {
    public static void main(String[] args) {
        User user = new User();
    }
}

class User {
    User referal = new User();
}
