import java.util.Date;

public class DiscussionProblem {
    public static void main(String[] args) {
        Date date = new Date();
        Person tom = new Person("Tom", "123 Main Street", "1234567890", "tom@gmail.com");
        System.out.println(tom.toString());
        Student jerry = new Student("Jerry", "123 Main Street", "1234567890", "jerry@gmail.com", 2);
        System.out.println(jerry.toString());
        Employee sam = new Employee("Sam", "123 Main Street", "1234567890", "sam@gmail.com", 123, 25000, date);
        System.out.println(sam.toString());
        Faculty john = new Faculty("John", "123 Main Street", "1234567890", "john@gmail.com", 123, 50000, date, "10:00-11:00", 1);
        System.out.println(john.toString());
        Staff jack = new Staff("Jack", "123 Main Street", "1234567890", "jack@gmail.com", 123, 75000, date, "President");
        System.out.println(jack.toString());

    }
}

class Person {
    public String name;
    public String address;
    public String phoneNumber;
    public String email;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "The Person's name is " + this.name;
    }
}

class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    public int classStatus;

    public Student(String name, String address, String phoneNumber, String email, int classStatus) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "The Student's name is " + this.name;
    }
}

class Employee extends Person {
    public int office;
    public int salary;
    public Date dateHired;

    public Employee() {
    }

    public Employee(String name, String address, String phoneNumber, String email, int office, int salary, Date dateHired) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "The Employee's name is " + this.name;
    }
}

class Faculty extends Employee {
    public static final int ASSISTANTPROFESSOR = 1;
    public static final int PROFESSOR = 2;
    public String officeHours;
    public int rank;

    public Faculty(String name, String address, String phoneNumber, String email, int office, int salary, Date dateHired, String officeHours, int rank) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
        this.officeHours = officeHours;
        this.rank = rank;

    }

    @Override
    public String toString() {
        return "The Faculty's n ame is " + this.name;
    }
}

class Staff extends Employee {
    public String title;

    public Staff(String name, String address, String phoneNumber, String email, int office, int salary, Date dateHired, String title) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
        this.title = title;
    }

    @Override
    public String toString() {
        return "The Staff's name is " + this.name;
    }
}