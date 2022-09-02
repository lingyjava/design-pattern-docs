package com.ly.pattern.nil;

/**
 * @author ly
 * @Date: 2022/9/2 9:11
 */
public class NullCustomer extends AbstractCustomer{

    @Override
    public String getName() {
        return "NOT FOUND CUSTOMER";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
