public class Static {
    
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Gedela Sivakrishna";
        s1.roll = 242;
        s1.schoolName = "Centurion University of technology and Management";
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.schoolName);

    }
}

class Student {

    String name;
    int roll;

    static String schoolName;
}