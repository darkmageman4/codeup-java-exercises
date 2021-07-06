package Employee;

public class Manager extends Employee {
        public static void main(String[] args) {
                //instance
                Manager Susy = new Manager();
                Susy.nameOfEmployee = "Susy";
                System.out.println(Susy.doWork());

                //instance
                Manager Bob = new Manager();
                Bob.nameOfEmployee = "Bob";
                Bob.department = "Sales";
                System.out.println(Bob.nameOfEmployee + " works in " + Bob.department);
        }
}