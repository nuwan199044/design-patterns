package com.myapp.designpatterns;

public class ExcelDocument extends Document implements Exportable {
    public ExcelDocument(String content) {
        super(content);
    }

    @Override
    public void export() {
        System.out.println("Exporting Excel: " + getContent());
    }
}
