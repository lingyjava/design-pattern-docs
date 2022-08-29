package com.ly.pattern.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lingy
 */
public class OrCriteria implements Criteria{

    private final CriteriaFemale criteriaFemale = new CriteriaFemale();

    private final CriteriaSingle criteriaSingle = new CriteriaSingle();
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = criteriaFemale.meetCriteria(persons);
        List<Person> singlePersons = criteriaSingle.meetCriteria(persons);
        return femalePersons.stream().filter(singlePersons::contains).collect(Collectors.toList());
    }
}
