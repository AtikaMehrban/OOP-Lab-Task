public class task4{

    // Experiment A: primitive int
    void changeNumber(int x) {
        x = 99;                                   
        System.out.println("Inside method: x = " + x);
    }

    // Experiment B: change the object's data through the copied reference
    void changeStudent(Student st) {
        st.completedCredits = 99;               
        System.out.println("Inside method: " + st.info());
    }

    // Experiment C: assign a brand new object to the parameter
    void reassignStudent(Student st) {
        st = new Student();                 
        System.out.println("Inside method: " + st.info());
    }

    public static void main(String[] args) {

        task4 demo = new task4();
                //  Experiment A 
        System.out.println("=== Experiment A: int ===");
        int number = 10;
        System.out.println("Before: number = " + number);
        demo.changeNumber(number);
        System.out.println("After: number = " + number);

        //  Experiment B
        System.out.println();
        System.out.println("=== Experiment B: change st.completedCredits ===");
        Student s1 = new Student(1, "Abeer Amina", 30);
        System.out.println("Before: " + s1.info());
        demo.changeStudent(s1);
        System.out.println("After: " + s1.info());

        //  Experiment C 
        System.out.println();
        System.out.println("=== Experiment C: st = new Student() ===");
        Student s2 = new Student(2, "Ali Ishtiaq", 45);
        System.out.println("Before: " + s2.info());
        demo.reassignStudent(s2);
        System.out.println("After: " + s2.info());
    }
}

class Student {

    int studentId;
    String name;
    int completedCredits;

    // Constructor with values
    Student(int studentId, String name, int completedCredits) {
        this.studentId = studentId;
        this.name = name;
        this.completedCredits = completedCredits;
    }

    // Constructor with no values (used in Experiment C)
    Student() {
        this.studentId = 0;
        this.name = "Unknown";
        this.completedCredits = 0;
    }

    String info() {
        return "ID: " + studentId + ", Name: " + name + ", Credits: " + completedCredits;
    }
}
