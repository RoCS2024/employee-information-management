package com.employee.info.mgmt.data.utils;

public class QueryConstants {

    public static final String GET_ALL_EMPLOYEE_STATEMENT = "SELECT * FROM EMPLOYEE";
    public static final String GET_EMPLOYEE_BY_ID_STATEMENT = "SELECT * FROM EMPLOYEE WHERE EMPLOYEE_NO = ?";
    public static final String ADD_EMPLOYEE_STATEMENT = "INSERT INTO EMPLOYEE (LAST_NAME, FIRST_NAME, MIDDLE_NAME, POSITION_IN_RC, DATE_EMPLOYED, BIRTHDATE, BIRTHPLACE, SEX, CIVIL_STATUS, CITIZENSHIP, RELIGION, HEIGHT, WEIGHT, EMAIL, SSS_NO, TIN_NO, PAGIBIG_NO, EMPLOYEE_NO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_STATEMENT = "UPDATE EMPLOYEE SET LAST_NAME = ?, FIRST_NAME = ?, MIDDLE_NAME = ?, POSITION_IN_RC = ?, DATE_EMPLOYED = ?, BIRTHDATE = ?, BIRTHPLACE = ?, SEX = ?, CIVIL_STATUS = ?, CITIZENSHIP = ?, RELIGION = ?, HEIGHT = ?, WEIGHT = ?, EMAIL = ?, SSS_NO = ?, TIN_NO = ?, PAGIBIG_NO = ? WHERE EMPLOYEE_NO = ?";
}