package com.myapp.designpatterns.service;

import com.myapp.designpatterns.dto.LoanInterest;

public class LoanService {
    public LoanInterest getLoanInterestInfo(String loanType) {
        LoanInterest loanInterest = null;
        switch (loanType) {
            case "personal":
                System.out.println("personal loan info");
                loanInterest = new LoanInterest(14.28);
                break;
            case "home":
                System.out.println("home loan info");
                loanInterest = new LoanInterest(8.05);
                break;
            case "lease":
                System.out.println("lease info");
                loanInterest = new LoanInterest(12.31);
                break;
            default:
                System.out.println("invalid loan type");
        }
        return loanInterest;
    }
}
