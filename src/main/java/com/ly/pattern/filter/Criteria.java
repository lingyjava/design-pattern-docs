package com.ly.pattern.filter;

import java.util.List;

/**
 * @author lingy
 */
public interface Criteria {
    /**过滤*/
    public List<Person> meetCriteria(List<Person> persons);
}
