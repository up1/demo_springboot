package service;

import model.EmployeeBody;

public class EmployeeService {

    private EmployeeDao dao;

    public EmployeeBody getEmployee(int id) {

        //Step 1
        System1 system1 = new System1();
        system1.validate(id);

        //Step 2
        EmployeeBody employeeBody =
                dao.getEmployee(id);

        return employeeBody;

    }

    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }
}
