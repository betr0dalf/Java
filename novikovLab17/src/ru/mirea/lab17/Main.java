package ru.mirea.lab17;

// task 2 Model-View-Controller

public class Main {
    public static void main(String[] args) {
        Employee model = new Employee("John Doe", 40, 10);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Alan Walker");
        controller.setEmployeeHoursWorked(35);
        controller.setEmployeeHourlyRate(12.5);

        controller.updateView();
    }
}
