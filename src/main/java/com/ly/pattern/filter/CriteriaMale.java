package com.ly.pattern.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lingy
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter((cur) -> cur.getGender().equalsIgnoreCase(GenderEnum.MALE.getCode())).collect(Collectors.toList());
    }
}
