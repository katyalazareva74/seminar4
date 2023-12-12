package directory;

public class Employee {
    private int servicenumber;
    private int experience;
    private String phonenumber;
    private String name;
    Employee(int servicenumber, String name, String phonenumber, int experience){
        this.experience=experience;
        this.name=name;
        this.phonenumber=phonenumber;
        this.servicenumber=servicenumber;
    }

    public int getExperience() {
        return experience;
    }

    public int getServicenumber() {
        return servicenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getName() {
        return name;
    }

    public void printemployee(){
        String str = "( табельный номер: "+this.servicenumber+", имя: "+this.name+", номер телефона: "+this.phonenumber+", стаж работы: "+ this.experience+")";
        System.out.println(str);
    }
}
