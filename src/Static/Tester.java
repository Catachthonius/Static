package Static;

//define a tester class where you:
//create 2 new Employee objects
//create their new 2 Badge
//show to the user the 2 employees' badge details

public class Tester {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Giovanni", "Mucciaccia", "Via Roma 7");
        Employee employee2 = new Employee("Lara", "Arlotta", "Via Perugia 16");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
