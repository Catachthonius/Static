package Static;
import java.util.UUID;

//define a class Badge with:
//a private static int variable called totalNumberOfEmployees (the value of this variable will be shared across multiple class instances)
//a private String variable called badgeIdCode
//a public Employee variable called employee
//a private static void method called keepTrackOfEmployeesNumber() that increments by 1 the totalNumberOfEmployees
//a private String method called generateBadgeIdCode() that returns a String containing name and surname of the employee between two random String codes (e.g. XYZNameSurnameZYX)
//a public void method called showBadgeDetails() that informs the user about:
//the total number of employee tracked by the badges
//the details of the employee
//the badgeIdCode
//a constructor method that takes an Employee param called employeeThatNeedsBadge and:
//call the static method for keeping track of the number of employees
//assign the value of employeeThatNeedsBadge to the object's employee property
//assign a generated id code to the object's badgeIdCode

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {

        String fullName = employee.getName() + employee.getSurname();
        String stringRandom1 = UUID.randomUUID().toString().replace("-"," ").substring(0,3);
        String stringRandom2 = UUID.randomUUID().toString().replace("-"," ").substring(0,3);

        return stringRandom1 + fullName + stringRandom2;
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees: " + totalNumberOfEmployees);
        System.out.println("Employee details:\n" + employee.getEmployeeDetails());
        System.out.println("Badge ID code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
