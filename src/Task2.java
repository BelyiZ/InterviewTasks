// Что будет если скомпилировать и запустить этот код?
// Как починить? Почему именно так?

public class Task2 {
    public static void main(String[] args) {
        User user = new User();
        user.setReferalId(112L);
    }
}

class User {
    Long id;

    User referal = new User();

    public void setReferalId(Long referalId) {
        this.referal.id = referalId;
    }
}
