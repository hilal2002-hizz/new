package com.company;

public class Finance {
    int basicSalary;
    int loan;
    int epfAndEtf;

    public int allowance() {
        HumanResources hr = new HumanResources();
        int wrkExp = hr.workingExp;

        int allowance;
        if (wrkExp > 5) {
            allowance = basicSalary * 15 / 100;
        } else if (wrkExp > 3) {
            allowance = basicSalary * 10 / 100;
        } else if (wrkExp > 2) {
            allowance = basicSalary * 8 / 100;
        } else {
            allowance = basicSalary * 5 / 100;
        }
        return allowance;
    }

    public int bonus() {
        int bonus;
        if (basicSalary >= 80_000) {
            bonus = basicSalary * 25 / 100;
        } else if (basicSalary >= 60_000) {
            bonus = basicSalary * 20 / 100;
        } else if (basicSalary >= 40_000) {
            bonus = basicSalary * 15 / 100;
        } else if (basicSalary >= 20_000) {
            bonus = basicSalary * 10 / 100;
        } else {
            bonus = basicSalary * 5 / 100;
        }
        return bonus;
    }
    public int deduction(){
        int ded;
        ded = loan + epfAndEtf;
        return ded;
    }
    public int grossSalary(){
        int gs;
         gs = (basicSalary + allowance() + bonus()) - deduction();
        return gs;

    }
}