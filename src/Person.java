public abstract class Person {
    private String name;
    private int age;
    private String national;
    private String surname;
    private int weight;
    private int height;
    private String colorSkin;


    public Person(String name, int age, String national, String surname,
                  int weight, int height, String colorSkin) {
        this.name = name;
        this.age = age;
        this.national = national;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.colorSkin = colorSkin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColorSkin() {
        return colorSkin;
    }

    public void setColorSkin(String colorSkin) {
        this.colorSkin = colorSkin;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", national='" + national + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", colorSkin='" + colorSkin + '\'' +
                '}';
    }

    public abstract void Parents();

    public abstract void city();
}




