package com.ly.pattern.entity.composite;

/**
 * @author ly
 * @Date: 2022/9/2 14:43
 */
public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (String cur : compositeEntity.getData()) {
            System.out.printf("%s  ", cur);
        }
        System.out.println();
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
