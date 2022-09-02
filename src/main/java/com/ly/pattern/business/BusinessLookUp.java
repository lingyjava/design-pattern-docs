package com.ly.pattern.business;

/**
 * @author ly
 * @Date: 2022/9/2 14:20
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase(EJBService.class.getSimpleName())) {
            return new EJBService();
        }
        if (serviceType.equalsIgnoreCase(JMSService.class.getSimpleName())) {
            return new JMSService();
        }
        return null;
    }
}
