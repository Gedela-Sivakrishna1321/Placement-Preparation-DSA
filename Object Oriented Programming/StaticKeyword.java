public class StaticKeyword {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "CUTM";
        System.out.println(s1.schoolName);
        s1.schoolName = "Centurion university";
        System.out.println(s1.schoolName);
    }
}

class Student {
    String name;
    int roll;
    public static String schoolName;

    
}
