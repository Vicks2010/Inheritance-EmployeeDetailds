import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before() {
        employee = new Employee("Nikhil", "NI007", 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Nikhil", employee.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI007", employee.getNiNumber());
    }

    @Test
    public void salary() {
        assertEquals(10.00, employee.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(10.00);
        assertEquals(20.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(00.1, employee.payBonus(), 0.01);
    }
}
