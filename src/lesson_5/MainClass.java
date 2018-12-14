package lesson_5;

public class MainClass {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Иванов Иван Иваныч", "Инженер", "ivanov1@apple.com", "+79853225577", 25000, 35);
        employeeArray[1] = new Employee("Иванов2 Иван2 Иваныч2", "Инженер2", "ivanov2@apple.com", "+79853221122", 35000, 45);
        employeeArray[2] = new Employee("Иванов3 Иван3 Иваныч3", "Инженер3", "ivanov3@apple.com", "+79853222233", 45000, 25);
        employeeArray[3] = new Employee("Иванов4 Иван4 Иваныч4", "Инженер4", "ivanov4@apple.com", "+79853223344", 55000, 55);
        employeeArray[4] = new Employee("Иванов5 Иван5 Иваныч5", "Инженер5", "ivanov5@apple.com", "+79853224455", 65000, 65);

        for (int i = 0; i < employeeArray.length ; i++) {
            if(employeeArray[i].getAge() > 40) {
                employeeArray[i].showPersonInfo();
            }
        }
    }



}
