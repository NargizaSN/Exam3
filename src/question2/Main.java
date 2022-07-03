package question2;

import java.util.LinkedList;


public class Main {

    static LinkedList<Person> personName = new LinkedList<Person>();

    public static void main(String[] args) throws DuplicateNameException {

        Person person1 = new Person("Ivanov", "Ivan", "Ivanovich");
        Person person2 = new Person("Petrov", "Petr", "Petrovich");
        Person person3 = new Person("Sidorov", "Ivan", "Petrovich");
        Person person4 = new Person("Amanov", "Aman", "Amanovich");
        Person person5 = new Person("Ivanov", "Ivan", "Ivanovich");


        try {
            addList(person1);
            addList(person2);
            addList(person3);
            addList(person4);
            addList(person5);

        } catch (DuplicateNameException ex) {
            System.out.println(ex.getMessage());
        }

        for (Person p : personName) {
            System.out.printf("Added to list: %s\n", p.getFullName());
        }
    }

    public static void addList(Person p) throws DuplicateNameException {
        if (searchList(p)) {
            throw new DuplicateNameException("Duplicated " + p.getFullName());
        }
        personName.add(p);
    }

    public static boolean searchList(Person p) {
        for (Person person : personName) {
            if (person.getFullName().equals(p.getFullName())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}









