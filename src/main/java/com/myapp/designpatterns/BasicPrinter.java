package com.myapp.designpatterns;

public class BasicPrinter implements Printable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
