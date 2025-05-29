package com.myapp.designpatterns;

public class ExporterService {
    public void exportDocument(Exportable document) {
        document.export();
    }
}
