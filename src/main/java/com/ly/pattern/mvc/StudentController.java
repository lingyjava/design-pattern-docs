package com.ly.pattern.mvc;

/**
 * @author ly
 * @Date: 2022/9/2 11:19
 */
public class StudentController {

    private Student student;

    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void showStudentDetails() {
        studentView.printStudentDetails(student);
    }
}
