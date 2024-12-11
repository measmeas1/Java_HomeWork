
public class App {
    public static void main(String[] args) throws Exception {
        EmployeeManager manager = new EmployeeManager();

        if (manager.login()) {
            System.out.println("Login Successful!");
            manager.displayMenu();
        } else {
            System.out.println("Login Failed! Exiting...");
        }
    }
}
