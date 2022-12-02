import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Comparator<Person> comparator;

        people.add(new Person("Леон", "де Камбре", 45));
        people.add(new Person("Гермиона", "де Вермендуа", 30));
        people.add(new Person("Дастин", "де Лаон", 15));
        people.add(new Person("Эд", "де Блуа", 20));
        System.out.println(people);

        comparator = (Person o1, Person o2) -> {
            String[] s1 = o1.surname.split(" ", 3);
            String[] s2 = o2.surname.split(" ", 3);
            if (s1.length != s2.length) {
                if (o1.surname.length() < o2.surname.length()) {
                    return -1;
                } else if (o1.surname.length() > o2.surname.length()) {
                    return 1;
                }
            }
            return Integer.compare(o1.age, o2.age);

        };
        Collections.sort(people,comparator);
        System.out.println(people);

    }
}
