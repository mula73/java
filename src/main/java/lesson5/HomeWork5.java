package lesson5;

public class HomeWork5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivan@mailbox.com",
                "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Creator", "petrov@mailbox.com",
                "892312314",50000,32);
        persArray[2] = new Person("Sidorov Andrey", "Engineer", "sidorov@mailbox.com",
                "892312315",100000,43);
        persArray[3] = new Person("Popova Nadegda", "EnvelopeLicker", "popova@mailbox.com",
                "892312316",15000,18);
        persArray[4] = new Person("Sudorova Lyudmila", "Accountant", "sudr@mailbox.com",
                "892312317",35000,47);

        for (Person employee : persArray)
            if (employee.getAge()>40)
                System.out.println(employee);
    }

}
