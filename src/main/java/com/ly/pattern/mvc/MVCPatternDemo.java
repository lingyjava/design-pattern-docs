package com.ly.pattern.mvc;

/**
 * @author ly
 * @Date: 2022/9/2 11:22
 */
public class MVCPatternDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNo("1");
        student.setName("Jack");
        StudentView studentView = new StudentView();
        StudentController controller = new StudentController(student, studentView);
        controller.showStudentDetails();

        student.setRollNo("2");
        student.setName("John");
        controller.showStudentDetails();
    }
}
