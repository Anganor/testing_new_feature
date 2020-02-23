package com.kodilla.hibernate.manytomany.facade;

public class SearchExceptions extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "No matching results found while searching for an employee.";
    public static String ERR_COMPANY_NOT_FOUND = "No matching results found while searching for the company.";

    public SearchExceptions(String message) {
        super(message);
    }
}
