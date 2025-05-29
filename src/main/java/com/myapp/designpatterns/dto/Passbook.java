package com.myapp.designpatterns.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Passbook {
    private String name;
    private String accountType;

    @Override
    public String toString() {
        return "Passbook{" +
                "name='" + name + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
