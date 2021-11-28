package com.company;

import java.util.Scanner;

public class UserInputsOutputs {
    EmployeePersonal emp = new EmployeePersonal();
    HumanResources hr = new HumanResources();
    Finance finance = new Finance();
    Development dev = new Development();

    Scanner scan = new Scanner(System.in);

    public void inputEmpPersonal() {
        System.out.print("Please Enter Your Name? ");
        emp.employeeName = scan.nextLine();

        System.out.println("Please Enter Your Contact Number? ");
        emp.employeeContact = scan.nextLine();

        System.out.println("Please Enter Your Email? ");
        emp.employeeEmail = scan.nextLine();

        System.out.println("Please Enter Your Address ");
        emp.employeeAddress = scan.nextLine();
    }

    public void inputHumanRes() {
        System.out.println("Please Enter Your Qualification 01?");
        hr.qualification1 = scan.nextLine();

        hr.qualification2 = "BSc";
        hr.workingExp = scan.nextInt();
        hr.achievements = "Best Employee Of The Year";
        hr.skills = "Project Handling Time, UX U1";
        hr.personalRecords = "None";
    }

    public void inputFinance() {
        finance.basicSalary = 95000;
        finance.epfAndEtf = 4500;
        finance.loan = 15000;
    }
    public void inputDev(){
        dev.currentProject = "RDA sign control";
        dev.projectDeadline = "23/01/2022";
        dev.reporting = "Mr.Malik";
    }
    public void outEmpPersonal() {
        System.out.println("Employee Name : " + emp.employeeName);
        System.out.println("Contact : " + emp.employeeContact);
        System.out.println("Email : " + emp.employeeEmail);
        System.out.println("Address : " + emp.employeeAddress);
    }

    public void outHumanRes(){
        System.out.println("Qualification 01 : "+hr.qualification1);
        System.out.println("Qualification 02 : "+hr.qualification2);
        System.out.println("Working Experience : "+hr.workingExp);
        System.out.println("Skill : "+hr.skills);
        System.out.println("Achievements : "+hr.achievements);
        System.out.println("Personal Records : "+hr.personalRecords);
    }
    public void outFinance(){
        System.out.println("Basic Salary : "+finance.basicSalary);
        System.out.println("EPF & ETF : "+finance.epfAndEtf);
        System.out.println("Loan : "+finance.loan);
        System.out.println("Allowance : "+finance.allowance());
        System.out.println("Deduction : "+finance.deduction());
        System.out.println("Bonus : "+finance.bonus());
        System.out.println("Gross Salary : "+finance.grossSalary());
    }
    public void outDev(){
        System.out.println("Current project : "+dev.currentProject);
        System.out.println("Deadline : "+dev.projectDeadline);
        System.out.println("Reporting : "+dev.reporting);
    }
    public void inputAll(){
        inputDev();
        inputFinance();
        inputEmpPersonal();
        inputHumanRes();
    }
    public void outAll(){
        System.out.println("PERSONAL DETAILS");
        System.out.println("****************");
        outEmpPersonal();
        System.out.println();

        System.out.println("HUMAN RESOURCES");
        System.out.println("***************");
        outHumanRes();
        System.out.println();

        System.out.println("FINANCE");
        System.out.println("*******");
        outFinance();
        System.out.println();

        System.out.println("PROJECT");
        System.out.println("*******");
        outDev();
        System.out.println();

    }
}

