// Task 8
// Что не так с этим кодом?

import java.util.Date;

public class User {

    private final String firstName, lastName, login, password;

    private final Date accessExpires;

    public User(String firstName, String lastName, String login,
                String password, Date accessExpires) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.accessExpires = accessExpires;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Date getAccessExpires() {
        return accessExpires;
    }
}
