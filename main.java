
import java.util.*;

public class main {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

        // Входные данные (имя и телефоны)
        String[][] contacts = {{"Vladislav", "12345678989"}, {"Pasha", "99999999999"}, {"Vladislav", "98765432111"}, {"Pasha", "88888888888"}, {"Pasha", "49338138684"}, {"Vladimir", "79124563211"}, {"Natalya", "45672349934"}};

        // Заполнение PhoneBook
        for (String[] contact : contacts) {
            String name = contact[0];
            String phone = contact[1];

            if (!phoneBook.containsKey(name)) {
                phoneBook.put(name, new HashSet<>());
            }
            phoneBook.get(name).add(phone);
        }

        // Сортировка по убыванию числа телефонов
        List<Map.Entry<String, HashSet<String>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        // Вывод результатов
        for (Map.Entry<String, HashSet<String>> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " numbers " + entry.getValue());
        }
    }
}