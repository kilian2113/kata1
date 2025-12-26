package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pepe", LocalDate.of(2004, 1, 24));
        System.out.println(person);
    }
}
