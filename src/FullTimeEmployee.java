class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void display() {
        System.out.println("Full-Time Employee: [ID: " + id + ", Name: " + name + ", Salary: " + salary + "]");
    }
}
