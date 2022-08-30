package com.ly.pattern.composite;

import java.math.BigDecimal;

/**
 * @author ly
 * @Date: 2022/8/30 10:27
 */
public class CompositeService {

    private static Employee employee;

    public static void buildEmployee() {

        Employee ceo = new Employee("John","CEO", new BigDecimal("30000"));

        Employee headSales = new Employee("Robert","Head Sales", new BigDecimal("20000"));

        Employee headMarketing = new Employee("Michel","Head Marketing", new BigDecimal("20000"));

        Employee clerk1 = new Employee("Laura","Marketing", new BigDecimal("10000"));
        Employee clerk2 = new Employee("Bob","Marketing", new BigDecimal("10000"));

        Employee salesExecutive1 = new Employee("Richard","Sales", new BigDecimal("10000"));
        Employee salesExecutive2 = new Employee("Rob","Sales", new BigDecimal("10000"));

        ceo.add(headSales);

        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        employee = ceo;
    }

    private static void showEmployee() {
        System.out.println(employee.toString());
    }

    public static void main(String[] args) {
        buildEmployee();
        showEmployee();
    }
}
