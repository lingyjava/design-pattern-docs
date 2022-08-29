package com.ly.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingy
 */
public class CriteriaService {

    private static List<Person> persons = new ArrayList<>();

    private static Criteria andCriteria = new AndCriteria();
    private static Criteria orCriteria = new OrCriteria();
    private static Criteria criteriaMale = new CriteriaMale();
    private static Criteria criteriaSingle = new CriteriaSingle();
    private static Criteria criteriaFemale = new CriteriaFemale();

    public static void buildPersons() {
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));
    }

    public static void criteriaPersons() {
        System.out.println(andCriteria.meetCriteria(persons));
        System.out.println(orCriteria.meetCriteria(persons));
        System.out.println(criteriaMale.meetCriteria(persons));
        System.out.println(criteriaSingle.meetCriteria(persons));
        System.out.println(criteriaFemale.meetCriteria(persons));

    }

    public static void main(String[] args) {
        buildPersons();
        criteriaPersons();
    }
}
