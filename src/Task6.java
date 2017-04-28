// Что будет выведено в консоль, если запустить этот код?

import java.util.Objects;

public class Task6 {
    public static void main(String[] args) {
        String reksoft = "Reksoft";
        String reksoftCopy = reksoft;
        String newReksoft = new String("Reksoft");
        StringBuilder reksoftBuilder = new StringBuilder("Reksoft");
        String reksoftUpper = "REKSOFT";

        System.out.println(reksoft == reksoftCopy);
        System.out.println(reksoft.equals(reksoftCopy));
        System.out.println(reksoft == "Reksoft");
        System.out.println(reksoft == ("Reksoft" + ""));
        System.out.println(reksoft == ("Rek" + "soft"));
        System.out.println(reksoft == newReksoft);
        System.out.println(reksoft.contentEquals(reksoftUpper));
        System.out.println(reksoft.contentEquals(reksoftBuilder));
        System.out.println(reksoft.equals(reksoftUpper));
        System.out.println(reksoft.equals(reksoftBuilder));
        System.out.println(reksoft.toUpperCase() == reksoft.toUpperCase());
        System.out.println(reksoft.toUpperCase() == reksoftUpper);
        System.out.println(reksoft.equals(null));
        System.out.println(Objects.equals(reksoft, null));
        System.out.println(Objects.equals(null, reksoft));
        System.out.println(Objects.equals(null, null));
        System.out.println(null == null);

    }
}
