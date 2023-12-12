package directory;

public class Main {
    /**
     * Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый
     * сотрудник должен иметь следующие атрибуты:
     * ○ Табельный номер
     * ○ Номер телефона
     * ○ Имя
     * ○ Стаж
     * Добавить метод, который ищет сотрудника по стажу (может быть список)
     * Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
     * Добавить метод, который ищет сотрудника по табельному номеру
     * Добавить метод добавление нового сотрудника в справочник
     * @param args
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Мария", "8456123657", 3);
        Employee employee2 = new Employee(2, "Светлана", "7854236156", 5);
        Employee employee3 = new Employee(3, "Борис", "3456895454", 2);
        Employee employee4 = new Employee(4, "Григорий", "7854236654", 5);
        Employee employee5 = new Employee(5, "Мария", "4523354458", 6);
        DirectoryEmployee directoryEmployee = new DirectoryEmployee();
        directoryEmployee.addemployee(employee1);
        directoryEmployee.addemployee(employee2);
        directoryEmployee.addemployee(employee4);
        directoryEmployee.addemployee(employee3);
        directoryEmployee.addemployee(employee5);
        directoryEmployee.printdirectory();
        System.out.println();
        directoryEmployee.experiencefind(5);
        System.out.println();
        directoryEmployee.servaicenumfind(3);
        System.out.println();
        directoryEmployee.phonenumfind("Мария");
    }
}
