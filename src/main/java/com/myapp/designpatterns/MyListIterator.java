package com.myapp.designpatterns;

import java.util.Iterator;
import java.util.List;

/**
 * @author nuwanw@zone24x7.com
 * @version 1.0
 * @date 11:42 AM 1/18/2024
 */
public class MyListIterator<T> implements MyIterator<T>, Iterator<T> {

    List<T> list;
    int index;

    public MyListIterator(List<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        System.out.println("call hasNext");
        return index < list.size();
    }

    @Override
    public T next() {
        System.out.println("call next");
        if(hasNext()) {
            return list.get(index++);
        } else {
            throw new IndexOutOfBoundsException("No more elements");
        }
    }
}
