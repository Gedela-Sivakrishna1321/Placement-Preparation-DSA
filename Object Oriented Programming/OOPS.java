public class OOPS {

    public static void main(String args[]) {
       

        Student s1 = new Student("Gedela Sivakrishna", 242, "abcd") ;
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        Student s2 = new Student(s1); // copied s1 object values to s2 object

        s1.marks[2] = 100; // changing marks of subject 3 
      
        // Print Marks
        for(int i=0; i<3; i++) {
            System.out.print(s2.marks[i] + " ");
        }
        System.out.println();
    }
}



class Student {

    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called ....");
    }

    Student(String name, int roll, String password) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        this.password = password;
    }

    // Shallow copy
    // Student(Student s) {
    //      marks = new int[3];
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.password = s.password;
    //     this.marks = s.marks;
    // }

    // Deep copy
    Student(Student s) {

       marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        this.password = s.password;
        for( int i=0; i<3; i++) {
            this.marks[i] = s.marks[i];
        }
    
    }
}


/*      
        Shallow Copy in copy constructor :- 
 *          Copies the references of the object. Changes made reflects in both the objects
 * 
 *      Deep copy in copy constructor :-
 *          Creates a new object & copies the values. Changes made in one doesn't get reflected 
 *          in copied object.
 * 
 */