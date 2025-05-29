package com.myapp.designpatterns.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoanInterest {
    private double interestRate;

    @Override
    public String toString() {
        return "LoanInterest{" +
                "interestRate=" + interestRate +
                '}';
    }
}
