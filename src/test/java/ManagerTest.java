import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Nikhil", "NI007", 10.00, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("Nikhil", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI007", manager.getNiNumber());
    }

    @Test
    public void salary() {
        assertEquals(10.00, manager.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10.00);
        assertEquals(20.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(00.1, manager.payBonus(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Sales", manager.getDeptName());
    }
}


