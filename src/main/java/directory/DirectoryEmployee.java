package directory;

import java.util.ArrayList;
import java.util.List;


public class DirectoryEmployee {
    private  List<Employee> listemployee;
    int size;
    DirectoryEmployee(){
        this.listemployee=new ArrayList<>();
        this.size=0;
    }
    public  void addemployee(Employee employee){
        listemployee.add(employee);
        size++;
    }

    public void printdirectory(){
        this.listemployee.stream().forEach((e1)-> e1.printemployee());
    }
    public void experiencefind(int exp1){
        System.out.println("Сотрудники со стажем: "+exp1);
         this.listemployee.stream().filter((e1)->e1.getExperience()==exp1).forEach((e1)->e1.printemployee());
    }
    public void servaicenumfind(int snumber){
        System.out.println("Сотрудник с табельным номером: "+snumber);
        this.listemployee.stream().filter((e1)->e1.getServicenumber()==snumber).findFirst().get().printemployee();
    }
    public void phonenumfind(String name){
        System.out.println("Телефоны сотрудников с именем: "+name);
        this.listemployee.stream().filter((e1)->e1.getName().equals(name)).map((s1)->s1.getPhonenumber()).forEach((s1)->System.out.println(s1));
    }
}
