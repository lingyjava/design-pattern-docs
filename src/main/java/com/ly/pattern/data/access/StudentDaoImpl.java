package com.ly.pattern.data.access;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ly
 * @Date: 2022/9/2 15:05
 */
public class StudentDaoImpl implements StudentDao{

    @Override
    public List<Student> getAllStudents() {
        // 假装 select * from student
        List<Student> students = new ArrayList<>();
        students.add(new Student("ly", 1));
        students.add(new Student("zh", 2));
        return students;
    }

    @Override
    public Student get(int rollNo) {
        // 假装 select * from student where rollNo = 1 limit 1
        return new Student("ly", 1);
    }

    @Override
    public void update(Student student) {
        // 假装 update student set name = "lyy" where rollNo = 3
        System.out.println("假装 update student set name = \"lyy\" where rollNo = 3");
    }

    @Override
    public void delete(Student student) {
        // 假装 delete from student where rollNo = 3
        System.out.println("假装 delete from student where rollNo = 3");
    }

    @Override
    public void insert(Student student) {
        // 假装 insert student(name, rollNo) values("ly??", 3)
        System.out.println("假装 insert student(name, rollNo) values(\"ly??\", 3)");
    }
}
