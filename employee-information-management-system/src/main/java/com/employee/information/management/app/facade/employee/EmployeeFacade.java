package com.employee.information.management.app.facade.employee;

import com.employee.information.management.app.model.Employee;

public interface EmployeeFacade {
    Employee getEmployeeByNo(String employeeNo) ;

    boolean updateEmployee(Employee employee);
}
