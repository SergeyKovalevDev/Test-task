package ru.sf.Testtask;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import ru.sf.Testtask.entity.Employee;
import ru.sf.Testtask.repository.EmployeeRepository;

import java.io.*;
import java.sql.Date;
import java.util.List;

//@EnableAutoConfiguration
public class TaskStarter {
    private final static String ADD_EMPLOYEE = "1";
    private final static String DELETE_EMPLOYEE = "2";
    private final static String CHANGE_POSITION = "3";
    private final static String LINKING_TO_MANAGER = "4";
    private final static String SORTING_BY_SURNAME = "5";
    private final static String SORTING_BY_DATE_OF_EMPLOYMENT = "6";
    private final static String EXIT = "7";
    List<Employee> employeeList;
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private FileInputStream inputStream;

    public void taskStart(EmployeeRepository repository) throws IOException {

//        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
//        EmployeeRepository repository = context.getBean(EmployeeRepository.class);
        showUserMenu();
        boolean isExit = false;
        while (!isExit) {
            switch (reader.readLine()) {
                case ADD_EMPLOYEE: addEmployee(repository);
                case DELETE_EMPLOYEE: deleteEmployee();
                case CHANGE_POSITION: changePosition();
                case LINKING_TO_MANAGER: linkingToManager();
                case SORTING_BY_SURNAME: sortingBySurname();
                case SORTING_BY_DATE_OF_EMPLOYMENT: sortingByDateOfEmployment();
                case EXIT: isExit = true;
                default:
                    System.out.println("Команда не распознана. Повторите ввод ");
            }
        }
    }

    private void showUserMenu() throws IOException {
        System.out.println("Введите\n" +
                ADD_EMPLOYEE + " - для добавления сотрудника\n" +
                DELETE_EMPLOYEE + " - для удаления сотрудника\n" +
                CHANGE_POSITION + " - для изменения типа сотрудника\n" +
                LINKING_TO_MANAGER + " - для привязки сотрудника к менеджеру\n" +
                SORTING_BY_SURNAME + " - для сортировки списка сотрудников по фамилии\n" +
                SORTING_BY_DATE_OF_EMPLOYMENT + " - для сортировки списка сотрудников по дате принятия работу\n" +
                EXIT + " - для выхода\n");

    }

    private void addEmployee(EmployeeRepository repository) throws IOException {
//        System.out.println("Введите полный путь к файлу с данными о сотруднике: ");
//        String filename = reader.readLine();
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
//        // handling file data
//        String position = bufferedReader.readLine();
////        if (position.equalsIgnoreCase("Employee"))
//        inputStream.close();
        repository.save(
                new Employee("employee", "Ivan", "Ivanov", "Ivanovich", Date.valueOf("2022-05-10")));
    }

    private void deleteEmployee() {}
    private void changePosition() {}
    private void linkingToManager() {}
    private void sortingBySurname() {displayListOfEmployees();}
    private void sortingByDateOfEmployment() {displayListOfEmployees();}
    private void displayListOfEmployees() {}
}

