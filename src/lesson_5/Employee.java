package lesson_5;

public class Employee {

    private String fio;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fio, String post, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void showPersonInfo() {
        System.out.println("Информация по сотруднику " + this.fio + ":");
        System.out.println();
        System.out.println("Должность: " + this.post);
        System.out.println("Email: " + this.email);
        System.out.println("Телефон: " + this.phone);
        System.out.println("Зарплата: " + this.salary);
        System.out.println("Возраст: " + this.age);
        System.out.println("========================================================");
    }

    public int getAge() {
        return this.age;
    }
}
