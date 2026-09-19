class OverloadDemo {

    // Signature: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in course: " + courseCode);
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in course: " + courseCode + ", section: " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course code: " + numericCourseCode);
    }

    // INVALID OVERLOAD (commented out after observing compiler error):
    // int enroll(String courseCode) {
    //     return 0;
    // }
    // Compiler error: method enroll(String) is already defined in class OverloadDemo
    // Reason: return type is NOT part of the method signature.

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        // Valid calls
        demo.enroll("CSC241");          // matches enroll(String)
        demo.enroll("CSC241", 2);       // matches enroll(String, int)
        demo.enroll(241);               // matches enroll(int)

        // Invalid calls (commented out):
        // demo.enroll();               // no matching method (no zero-arg overload)
        // demo.enroll("241", "2");     // no matching method (String, String not defined)

        // Stretch: show(long) vs show(double) for show(10)
        // 10 is an int literal. int widens to long or double.
        // Java prefers the most specific widening: long is more specific than double.
        // So show(long) is selected.
    }
}