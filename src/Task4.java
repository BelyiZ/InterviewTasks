// Нужно дописать код так, чтобы напечаталось "Hello world"

import java.util.Optional;

public class Task4 {

    interface I {
        String generate();

        default void print(String value) {
            System.out.println(
                    Optional.ofNullable(value)
                            .orElseGet(                 )
            );
        }
    }

    public static void main(String[] args) {
        ((I) () -> "Hello world").print(null);
    }
}
