package service;

import model.EmployeeBody;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @Test(expected = EmployeeNotFoundException.class)
    public void  data_not_found_when_id_10() {
        EmployeeService employeeService
                = new EmployeeService();
        employeeService.setDao(new MockEmployeeWith404Dao());

        employeeService.getEmployee(10);


    }
    @Test
    public void  success_when_id_1234() {

        EmployeeBody expected
                = new EmployeeBody(1234, "", "");

        EmployeeService employeeService
                = new EmployeeService();
        employeeService.setDao(new MockEmployeeDao());

        EmployeeBody actual
                = employeeService.getEmployee(1234);

        assertEquals(expected, actual);


    }

    class MockEmployeeDao extends EmployeeDao {
        @Override
        public EmployeeBody getEmployee(int id) {
            return new EmployeeBody(1234, "", "");
        }
    }

    class MockEmployeeWith404Dao extends EmployeeDao {
        @Override
        public EmployeeBody getEmployee(int id) {
            throw new EmployeeNotFoundException();
        }
    }

}