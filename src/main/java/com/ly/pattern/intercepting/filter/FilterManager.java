package com.ly.pattern.intercepting.filter;

/**
 * @author ly
 * @Date: 2022/9/5 13:12
 */
public class FilterManager {

    private FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
