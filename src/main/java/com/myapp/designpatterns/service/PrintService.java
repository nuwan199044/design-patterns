package com.myapp.designpatterns.service;

import com.myapp.designpatterns.dto.Passbook;

public class PrintService {
    public void print(Passbook passbook) {
        System.out.println(passbook.toString());
    }
}
