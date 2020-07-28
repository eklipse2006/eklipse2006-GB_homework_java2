package lesson3_hw;


import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        String[] array = new String[]{"я", "узнал", "что", "у", "меня", "есть",
                "огромная", "семья", "и", "тропинка", "и", "лесок", "в", "поле", "каждый", "колосок",
                "речка", "небо", "голубое", "это", "всё", "моё", "родное", "это", "родина", "моя",
                "всех", "люблю", "на", "свете", "я"};
        System.out.println("Список слов, из которых состоит текст: " + wordList(array));
        countRepeatWords(array);

        Person p1 = new Person("+79111234567", "ivanov@ya.ru", "Ivanov");
        Person p2 = new Person("+79111234568", "petrov@ya.ru", "Petrov");
        Person p3 = new Person("+79111234569", "sidorov@ya.ru", "Sidorov");
        Person p4 = new Person("+79111234570", "petrov@mail.ru", "Petrov");
        Person p5 = new Person("+79111234571", "orlov@ya.ru", "Orlov");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(p1);
        phoneBook.add(p2);
        phoneBook.add(p3);
        phoneBook.add(p4);
        phoneBook.add(p5);
        System.out.println(phoneBook.getPhones("Petrov"));
        System.out.println(phoneBook.getEmails("Petrov"));

    }

    public static HashSet<String> wordList(String[] array) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
        return hashSet;
    }

    public static void countRepeatWords(String[] array) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);
            }
        }
        System.out.println("Количество слов: " + hashMap);
    }
}
