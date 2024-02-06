package inheritance;

public class Student extends Person{

    private int score;
    private String profession;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Student(int id, String name, String lastname, int score, String profession) {
        super(id, name, lastname);
        this.score = score;
        this.profession = profession;
    }

    @Override
    public void goToUni(){
        System.out.println("Go by bus");
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println(score);
        System.out.println(profession);
    }
}
