package com.ly.pattern.nil;

/**
 * @author ly
 * @Date: 2022/9/2 9:09
 */
public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
