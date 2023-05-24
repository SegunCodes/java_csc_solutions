public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

}

class employeeTest {
    public static void main(String[] args) {
        Employee workerOne = new Employee("Cornerstone", "Ephraim", 15000);
        Employee workerTwo = new Employee("Daniel", "Akintunde", 15000);

        System.out.println(workerOne.getFirstName() + " " + workerOne.getLastName() + "'s yearly salary is : "
                + workerOne.getMonthlySalary() * 12);
        System.out.println(workerTwo.getFirstName() + " " + workerTwo.getLastName() + "'s yearly salary is : "
                + workerTwo.getMonthlySalary() * 12);

        workerOne.setMonthlySalary(workerOne.getMonthlySalary() + (workerOne.getMonthlySalary() * 0.1));
        workerTwo.setMonthlySalary(workerTwo.getMonthlySalary() + (workerTwo.getMonthlySalary() * 0.1));

        System.out.println(workerOne.getFirstName() + " " + workerOne.getLastName() + "'s new yearly salary is : "
                + workerOne.getMonthlySalary() * 12);
        System.out.println(workerTwo.getFirstName() + " " + workerTwo.getLastName() + "'s new yearly salary is : "
                + workerTwo.getMonthlySalary() * 12);

    }
}