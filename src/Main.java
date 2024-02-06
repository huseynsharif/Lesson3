import inheritance.Person;
import inheritance.Student;
import inheritance.Teacher;

public class Main {
    public static void main(String[] args) {
//        User user = new User();
//        user.setName("Adil");
//        user.setSurname("Feteliyev");
//        user.setFullName();
//        System.out.println(user.getFullName());

        Student student = new Student(1, "Nermin", "Memmedli", 100, "IT");

        student.setName("Elman");

        Person person = new Person(2, "Anar", "Feteliyev");
        Teacher teacher = new Teacher(3, "Shebnem", "Memmedova", 1000);
        teacher.goToUni();
        student.dasd();
//        System.out.println(student.getName());
    }
}