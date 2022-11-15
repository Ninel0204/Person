import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person("Леон", "де Камбре",45));
        people.add(new Person("Гермиона","де Вермендуа",30));
        people.add(new Person("Дастин","де Лаон",15));
        people.add(new Person("Эд","де Блуа",20));
        System.out.println(people);

        Collections.sort(people,new PersonComporator());
        System.out.println(people);

    }
}