package com.ly.pattern.service.locator;

/**
 * @author ly
 * @Date: 2022/9/5 17:14
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service != null) {
            return service;
        }
        InitialContext initialContext = new InitialContext();
        service = (Service) initialContext.lookup(jndiName);
        cache.addService(service);
        return service;
    }
}
