package com.Geekbrains.Homework.HomeWorkApp5;

public class Demonstration {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 41);
        empCorp[1] = new Employee ("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314", 50000, 32);
        empCorp[2] = new Employee("Sidirov Sidr", "Water pot", "sidorov@mailbox.com", "892312315", 10000, 43);
        empCorp[3] = new Employee("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316", 5000, 18);
        empCorp[4] = new Employee("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317", 3000, 21);
        for (Employee employee : empCorp)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}