package com.ly.pattern.transfer.obj;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

    /**假设为数据库*/
    private List<StudentVO> students;

    /**初始化数据库*/
    public StudentBO() {
        students = new ArrayList<>();
        students.add(new StudentVO("Jack", 1));
        students.add(new StudentVO("Many", 2));
    }

    public void deleteStudent(StudentVO studentVO) {
        students.remove(studentVO);
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudentByRollNo(int rollNo) {
        for (StudentVO cur : students) {
            if (rollNo == cur.getRollNo()) {
                return cur;
            }
        }
        return null;
    }

    public void updateStudent(StudentVO studentVO) {
        StudentVO target = getStudentByRollNo(studentVO.getRollNo());
        target.setName(studentVO.getName());
    }

    public void insertStudent(StudentVO studentVO) {
        if (studentVO == null) {
            return;
        }
        students.add(studentVO);
    }
}
