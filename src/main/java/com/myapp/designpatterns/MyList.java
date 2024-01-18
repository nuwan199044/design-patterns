package com.myapp.designpatterns;

import java.util.Iterator;
import java.util.List;

/**
 * @author nuwanw@zone24x7.com
 * @version 1.0
 * @date 11:51 AM 1/18/2024
 */
public class MyList<T> implements Iterable<T> {

    private List<T> list;

    public MyList(List<T> list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<>(list);
    }
}
