package com.ly.pattern.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lingy
 */
public class CriteriaSingle implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter((cur) -> cur.getMaritalStatus().equalsIgnoreCase(MaritalStatusEnum.SINGLE.getCode())).collect(Collectors.toList());
    }
}
