public class Employee {
    private String name;
    private String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public void printDetails() {
        System.out.println("👤 Name: " + name + ", Dept: " + dept);
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
