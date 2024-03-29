package inheritance;

public class Person {
    private int id;
    private String name;
    private String lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Person(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public void goToUni(){
        System.out.println("Go by something");
    }

    public void showInfos(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(lastname);
    }
}
