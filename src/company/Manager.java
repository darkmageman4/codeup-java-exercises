package company;

public class Manager extends company.Employee {
        public static void main(String[] args) {
                Manager monger = new Manager();
                System.out.println(monger.doWork());
        }

        public String doWork() {
                return "manging employees";
        }
}