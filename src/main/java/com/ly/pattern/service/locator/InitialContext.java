package com.ly.pattern.service.locator;

/**
 * @author ly
 * @Date: 2022/9/5 13:51
 */
public class InitialContext {

    /**查找具体服务*/
    public Object lookup(String jndiName) {
        if (ServiceImpl1.class.getSimpleName().equalsIgnoreCase(jndiName)) {
            return new ServiceImpl1();
        }
        if (ServiceImpl2.class.getSimpleName().equalsIgnoreCase(jndiName)) {
            return new ServiceImpl2();
        }
        return null;
    }
}
