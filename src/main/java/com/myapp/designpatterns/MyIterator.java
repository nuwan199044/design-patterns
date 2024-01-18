package com.myapp.designpatterns;

/**
 * @author nuwanw@zone24x7.com
 * @version 1.0
 * @date 11:40 AM 1/18/2024
 */
public interface MyIterator<T> {

    boolean hasNext();

    T next();
}
