package inheritance;

public class Teacher extends Person{
    private int salary;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher(int id, String name, String lastname, int salary) {
        super(id, name, lastname);

        this.salary = salary;
    }

    @Override
    public void goToUni(){
        System.out.println("Go by car");
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println(salary);
    }
}
