package csc372_week6_opt2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alison", "123 Parkway Ave"));
        students.add(new Student(1, "Bobby", "234 Maples St"));
        students.add(new Student(2, "Charlie", "345 Oaktree St"));
        students.add(new Student(8, "Mary", "765 Story Ave"));
        students.add(new Student(5, "Joseph", "635 Lufen St"));
        students.add(new Student(4, "Zachary", "211 Bills St"));
        students.add(new Student(7, "Helen", "924 primrose Ave"));
        students.add(new Student(10, "Charlotte", "673 Webster St"));
        students.add(new Student(6, "Sarah", "806 Holmes St"));
        students.add(new Student(9, "Christopher", "109 Picnic Ave"));


        System.out.println("Before sorting:");
        students.forEach(System.out::println);

        MergeSort.mergeSort(students, new RollNoComparator());

        System.out.println("\nAfter sorting:");
        students.forEach(System.out::println);
    }
}
