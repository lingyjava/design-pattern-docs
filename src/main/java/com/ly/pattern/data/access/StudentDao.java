package com.ly.pattern.data.access;

import java.util.List;

/**
 * @author ly
 * @Date: 2022/9/2 15:03
 */
public interface StudentDao {

    List<Student> getAllStudents();

    Student get(int rollNo);

    void update(Student student);

    void delete(Student student);

    void insert(Student student);
}
