public class Teacher implements educationalUnit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public String getName() { return name; }

    public void displayDetails(String indent) {
        System.out.println(indent + "Teacher: " + name + " (Subject: " + subject + ", Salary: " + salary + ")");
    }

    public int getStudentCount() { return 0; }

    public double getBudget() { return salary; }
}
