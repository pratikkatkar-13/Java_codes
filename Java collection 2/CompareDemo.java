import java.util.*;

// 1️⃣ Implementing Comparable
class Person implements Comparable<Person> {
    String name;
    int age;
    double salary;

    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Natural ordering by age using Comparable
    @Override
    public int compareTo(Person other) {
        // Safer way to compare int
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Salary: " + salary;
    }
}

public class CompareDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 28, 50000));
        people.add(new Person("Bob", 25, 60000));
        people.add(new Person("Charlie", 30, 40000));

        // 1️⃣ Using Comparable - natural ordering by age
        Collections.sort(people);
        System.out.println("Sorted by age using Comparable:");
        printList(people);

        // 2️⃣ Using Comparator - sort by salary (ascending)
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Double.compare(p1.salary, p2.salary);
            }
        });
        System.out.println("\nSorted by salary using Comparator:");
        printList(people);

        // 3️⃣ Using Comparator.comparing() - sort by name
        people.sort(Comparator.comparing(p -> p.name));
        System.out.println("\nSorted by name using Comparator.comparing:");
        printList(people);

        // 4️⃣ Using Comparator.comparing() with method reference
        // people.sort(Comparator.comparing(Person::getAge));
        // System.out.println("\nSorted by age again using method reference:");
        // printList(people);
    }

    static void printList(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}

// Add a getter for age to use with method reference
class PersonWithGetter extends Person {
    PersonWithGetter(String name, int age, double salary) {
        super(name, age, salary);
    }

    public int getAge() {
        return age;
    }
}
