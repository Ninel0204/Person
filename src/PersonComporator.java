import java.util.Comparator;

public class PersonComporator implements Comparator<Person> {
    protected int maxSurname = 0;

    public PersonComporator(int worldSurname) {
        if (worldSurname > 0) {
            this.maxSurname = worldSurname;
        }
    }

    public PersonComporator() {
    }


    @Override
    public int compare(Person o1, Person o2) {
        String[] s1 = o1.surname.split(" ", maxSurname);
        String[] s2 = o2.surname.split(" ", maxSurname);
        if (s1.length != s2.length) {
            if (o1.surname.length() < o2.surname.length()) {
                return -1;
            } else if (o1.surname.length() > o2.surname.length()) {
                return 1;
            }
        }
            return Integer.compare(o1.age, o2.age);

    }
}
