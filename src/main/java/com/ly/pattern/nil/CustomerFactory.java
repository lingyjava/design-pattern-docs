package com.ly.pattern.nil;

/**
 * @author ly
 * @Date: 2022/9/2 9:12
 */
public class CustomerFactory {

    private static String[] names = {"John","Jack","Joe"};

    public static AbstractCustomer getCustomer(String name) {
        for (String cur : names) {
            if (cur.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
