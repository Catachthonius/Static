package Static;

//define a class Employee with:
//3 instance variables name, surname and address
//a constructor method that assigns 3 params (newEmployeeName, newEmployeeSurname, newEmployeeAddress) to the respective object's properties
//a method getEmployeeDetails() that returns an informative String with all the details of the Employee

public class Employee {
        private String name;
        private String surname;
        private String address;

        public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
            this.name = newEmployeeName;
            this.surname = newEmployeeSurname;
            this.address = newEmployeeAddress;
        }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String getEmployeeDetails() {
            return "Name: " + name + "\nSurname: " + surname + "\nAddress: " + address;
        }
    }
