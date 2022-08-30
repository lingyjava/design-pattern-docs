package com.ly.pattern.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ly
 * @Date: 2022/8/30 10:23
 *
 * 雇员类
 */
public class Employee {
    /**姓名*/
    private String name;
    /**部门*/
    private String dept;
    /**薪资*/
    private BigDecimal salary;
    /**下属*/
    private List<Employee> subordinates;

    public Employee(String name, String dept, BigDecimal salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
