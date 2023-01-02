public class Football  extends  Person{
    private  int speed;

    public int  getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Football(String name, int age, String national, String surname,
                    int weight, int height, String colorSkin, int speed) {
        super(name, age, national, surname, weight, height, colorSkin);
        this.speed = speed;

    }

    @Override
    public void Parents() {

    }

    @Override
    public void city() {

    }
}
