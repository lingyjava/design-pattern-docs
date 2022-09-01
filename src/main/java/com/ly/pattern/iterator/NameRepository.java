package com.ly.pattern.iterator;

/**
 * @author ly
 * @Date: 2022/9/1 11:10
 */
public class NameRepository {

    private String[] names = {"ly","hq","zh","jy"};

    public Iterator getNameIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
