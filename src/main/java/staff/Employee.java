package staff;

public abstract class Employee {

    private String name;
    private int NI;
    private double salary;

    public Employee(String name, int NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNI() {
        return NI;
    }

    public void setNI(int NI) {
        this.NI = NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        this.salary = salary * raise;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
