public class universityClient {
    public static void main(String[] args) {
        // Students
        Student s1 = new Student("Alice", "S001", 2000);
        Student s2 = new Student("Bob", "S002", 2500);
        Student s3 = new Student("Charlie", "S003", 3000);

        // Teachers
        Teacher t1 = new Teacher("Dr. Smith", "Math", 5000);
        Teacher t2 = new Teacher("Dr. John", "Physics", 6000);

        // Department
        Department csDept = new Department("Computer Science");
        csDept.addUnit(t1);
        csDept.addUnit(s1);
        csDept.addUnit(s2);

        // Sub College
        College engCollege = new College("Engineering College");
        engCollege.addUnit(csDept);
        engCollege.addUnit(t2);
        engCollege.addUnit(s3);

        // University
        College university = new College("New Era University");
        university.addUnit(engCollege);

        // Display info
        university.displayDetails("");
        System.out.println("Total Students: " + university.getStudentCount());
        System.out.println("Total Budget: $" + university.getBudget());
    }
}
