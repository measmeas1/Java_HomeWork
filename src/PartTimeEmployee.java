class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void display() {
        System.out.println("Part-Time Employee: [ID: " + id + ", Name: " + name + ", Salary: " + salary + "]");
    }
}
