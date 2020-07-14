package lesson3_hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<Person>> phoneBook= new HashMap<>();

    public void add(Person person) {
        String name = person.getName().toLowerCase().trim();
        HashSet<Person> persons = phoneBook.get(name);
        if (persons == null) {
            persons = new HashSet<>();
            phoneBook.put(name, persons);
        }
        persons.add(person);
    }

    public ArrayList<String> getPhones(String name) {
        String searchName = name.toLowerCase().trim();
        HashSet<Person> persons = phoneBook.get(searchName);
        ArrayList<String> phones = new ArrayList<>();
        for (Person person : persons) {
            phones.addAll(person.getPhone());
        }
        return phones;
    }

    public ArrayList<String> getEmails(String name) {
        String searchName = name.toLowerCase().trim();
        HashSet<Person> persons = phoneBook.get(searchName);
        ArrayList<String> phones = new ArrayList<>();
        for (Person person : persons) {
            phones.add(person.getEmail());
        }
        return phones;
    }
}
