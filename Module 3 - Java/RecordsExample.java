import java.util.List;

record Person(String name, int age) {}

public class RecordsExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Nithish", 20),
                new Person("Arun", 17),
                new Person("Karthik", 22)
        );

        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}