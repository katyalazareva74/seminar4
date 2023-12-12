package seminar;

import java.util.*;


public class Main {
    public static <Map> void main(String[] args) {
        /** Задание 1
         * Создайте коллекцию мужских и женских имен с помощью интерфейса List
         * Отсортируйте коллекцию в алфавитном порядке
         * Отсортируйте коллекцию по количеству букв в слове
         * Разверните коллекцию
         */
        System.out.println("Задание 1.");
        List<String> teams = List.of("Александр", "Мария", "Тамара", "Борис", "Глеб", "Глеб", "Мария");
        Team.sortalph(teams);
        System.out.println();
        Team.sortchar(teams);
        System.out.println();
        Team.reverslist(teams);
        System.out.println();
        /** Задание 2
         * Создайте коллекцию мужских и женских имен с помощью интерфейса List: добавьте повторяющиеся значения;
         * Получите уникальный список Set на основании List
         * Определите наименьший элемент (алфавитный порядок)
         * Определите наибольший элемент (по количеству букв в слове но в обратном
         * порядке)
         * Удалите все элементы содержащие букву ‘A’
         */
        System.out.println("Задание 2.");
        Team.set2(teams);
        System.out.println();
        System.out.println(Team.sortalphset(teams));
        System.out.println();
        System.out.println(Team.sortcharset(teams));
        System.out.println();
        Team.containrset(teams);
        /**Задание 3
         * Создайте телефонный справочник с помощью Map - телефон это ключ, а имя - значение
         * Найдите человека с самым маленьким номером телефона
         * Найдите номер телефона человека чье имя самое большое в алфавитном порядке
         */
        System.out.println("Задание 3.");
        java.util.Map<String, String> bookphone = new HashMap<>();
        bookphone.put("8549645212", "Сидоров");
        bookphone.put("7452369841", "Петров");
        bookphone.put("6234587811", "Сидоров");
        bookphone.put("5847222334", "Васильев");
        String minkey=Team.humanfind(bookphone);
        System.out.println(minkey+" -> "+bookphone.get(minkey));
        Team.phonefind(bookphone);
    }
}
