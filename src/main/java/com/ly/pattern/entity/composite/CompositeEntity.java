package com.ly.pattern.entity.composite;

/**
 * @author ly
 * @Date: 2022/9/2 14:41
 *
 * 组合实体
 */
public class CompositeEntity {

    private CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        coarseGrainedObject.setData(data1, data2);
    }

    public String[] getData() {
        return coarseGrainedObject.getData();
    }
}
