package com.ly.pattern.mvc;

/**
 * @author ly
 * @Date: 2022/9/2 11:16
 */
public class StudentView {

    public void printStudentDetails(Student student) {
        System.out.printf("Student : %n RollNo : %s %n StudentName : %s %n", student.getRollNo(), student.getName());
    }
}
