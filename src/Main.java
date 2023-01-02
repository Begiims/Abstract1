public class Main {
    public static void main(String[] args) {
        Student student = new Student("Beknur",18,"Kyrgyz","Arapov",
                50,163,"White",11);
        Student student1 = new Student("Beknur",18,"Kyrgyz","Arapov",
                50,163,"White",11);
        Student student2 = new Student("Beknur",18,"Kyrgyz","Arapov",
                50,163,"White",11);
        Student student3 = new Student("Beknur",18,"Kyrgyz","Arapov",
                50,163,"White",11);
        Student student4 = new Student("Beknur",18,"Kyrgyz","Arapov",
                50,163,"White",11);
        System.out.println();




        Football football = new Football("Almaz",22,"Uzbek",
                "tyuhjjk",77,176,"Brown",93);
        Football football1 = new Football("Almaz",22,"Uzbek",
                "tyuhjjk",77,176,"Brown",93);
        Football football2 = new Football("Almaz",22,"Uzbek",
                "tyuhjjk",77,176,"Brown",93);
        Football football3 = new Football("Almaz",22,"Uzbek",
                "tyuhjjk",77,176,"Brown",93);
        Football football4 = new Football("Almaz",22,"Uzbek",
                "tyuhjjk",77,176,"Brown",93);

        Person[] human = {student,football,student1,football1,student2,
                football2,student3, football3,student4, football4};
        for ( Person  b :human) {
            System.out.println(b);

        }
    }
}