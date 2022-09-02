package com.ly.pattern.data.access;

/**
 * @author ly
 * @Date: 2022/9/2 15:00
 *
 * 数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来。
 */
public class DataAccessObjectPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        Student student = studentDao.get(3);
        studentDao.delete(student);
    }
}
