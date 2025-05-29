package com.myapp.designpatterns;

public class PdfDocument extends Document implements Exportable {

    public PdfDocument(String content) {
        super(content);
    }

    @Override
    public void export() {
        System.out.println("Exporting PDF: " + getContent());
    }
}
