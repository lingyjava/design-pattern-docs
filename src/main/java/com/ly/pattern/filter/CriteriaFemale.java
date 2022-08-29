package com.ly.pattern.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lingy
 */
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter((cur) -> cur.getGender().equalsIgnoreCase(GenderEnum.FEMALE.getCode())).collect(Collectors.toList());
    }
}
