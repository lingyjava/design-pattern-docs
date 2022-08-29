package com.ly.pattern.filter;

import java.util.List;

/**
 * @author lingy
 */
public class AndCriteria implements Criteria{

    private final CriteriaMale criteriaMale = new CriteriaMale();

    private final CriteriaSingle criteriaSingle = new CriteriaSingle();


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return criteriaSingle.meetCriteria(criteriaMale.meetCriteria(persons));
    }
}
