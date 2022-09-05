package com.ly.pattern.service.locator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ly
 * @Date: 2022/9/5 13:53
 */
public class Cache {

    private List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("service from cache");
                return service;
            }
        }
        return null;
    }

    public void addService(Service service) {
        if (!services.contains(service)) {
            services.add(service);
        }
    }
}
