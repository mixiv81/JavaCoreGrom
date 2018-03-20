package Lesson13.L8;


import Lesson8.HierarchyOfStudents.Course;
import Lesson8.HierarchyOfStudents.Student;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Course[] courseTaken = new Course[10];
        Course course = new Course(new Date(), "Phis", 125, "Oleg", students);
        Student student = new Student("Ihor", "Zhluktenko", 45, courseTaken);

        Lesson8.HierarchyOfStudents.Demo demo = new Lesson8.HierarchyOfStudents.Demo();
        System.out.println(demo.createHighestParent());

        System.out.println(demo.createLowestChild());

    }
}
