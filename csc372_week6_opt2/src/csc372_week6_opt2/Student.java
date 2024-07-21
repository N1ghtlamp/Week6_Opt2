package csc372_week6_opt2;

public class Student {
    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
               "rollno=" + rollno +
               ", name='" + name + '\'' +
               ", address='" + address + '\'' +
               '}';
    }
}
