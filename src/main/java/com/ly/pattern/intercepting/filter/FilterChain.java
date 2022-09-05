package com.ly.pattern.intercepting.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ly
 * @Date: 2022/9/5 13:08
 */
public class FilterChain {

    /**过滤器链*/
    private List<Filter> filters = new ArrayList<>();

    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request) {
        filters.forEach((cur) -> cur.execute(request));
        target.execute(request);
    }
}
