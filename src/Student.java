public class Student  extends Person{
    private int  grade;

    public int  getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int age, String national, String surname,
                   int weight, int height, String colorSkin, int grade) {
        super(name, age, national, surname, weight, height, colorSkin);
        this.grade = grade;

    }

    @Override
    public void Parents() {

    }

    @Override
    public void city() {

    }
}
