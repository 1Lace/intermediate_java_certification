## Данный код представляет собой программу на языке Java, которая создает телефонную книгу (phoneBook) в виде HashMap, где ключом является имя контакта, а значением - HashSet с номерами телефонов этого контакта.

## В программе задан массив контактов (contacts) в формате [имя, номер телефона]. Для каждого контакта из массива программа добавляет номер телефона в HashSet соответствующего имени в phoneBook.

            
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



## Затем программа сортирует записи в phoneBook по убыванию количества номеров телефонов у каждого контакта. Для этого используется сортировка списка (list), который представляет собой набор записей (Map.Entry) из phoneBook.

    List<Map.Entry<String, HashSet<String>>> list = new ArrayList<>(phoneBook.entrySet());
    list.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

    
## Затем, программа выводит отсортированный список контактов с указанием количества номеров телефонов у каждого контакта и список самих номеров телефонов.

    for (Map.Entry<String, HashSet<String>> entry : list) {
         System.out.println(entry.getKey() + ": " + entry.getValue().size() + " numbers " + entry.getValue());
    }

## Таким образом, данный код позволяет создать и заполнить телефонную книгу, отсортировать контакты по количеству номеров телефонов и вывести результат на экран.
