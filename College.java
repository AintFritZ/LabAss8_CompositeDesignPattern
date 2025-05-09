import java.util.ArrayList;
import java.util.List;

public class College implements educationalUnit {
    private String name;
    private List<educationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addUnit(educationalUnit unit) {
        units.add(unit);
    }

    public void displayDetails(String indent) {
        System.out.println(indent + "College: " + name);
        for (educationalUnit unit : units) {
            unit.displayDetails(indent + "  ");
        }
    }

    public int getStudentCount() {
        return units.stream().mapToInt(educationalUnit::getStudentCount).sum();
    }

    public double getBudget() {
        return units.stream().mapToDouble(educationalUnit::getBudget).sum();
    }
}
