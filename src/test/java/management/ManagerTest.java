package management;

import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Dave", 2, 1000, "Product Development");
    }

    @Test
    public void getName() {
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void setName() {
        manager.setName("Scott");
        assertEquals("Scott", manager.getName());
    }

    @Test
    public void getNI() {
        assertEquals(2, manager.getNI());
    }

    @Test
    public void setNI() {
        manager.setNI(5);
        assertEquals(5, manager.getNI());
    }

    @Test
    public void getSalary() {
        assertEquals(1000, manager.getSalary(), 0.01);
    }

    @Test
    public void setSalary() {
        manager.setSalary(5000);
        assertEquals(5000, manager.getSalary(), 0.01);
    }

    @Test
    public void getDeptName(){
        assertEquals("Product Development", manager.getDeptName());
    }

    @Test
    public void setDeptName(){
        manager.setDeptName("Finance");
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(1.5);
        assertEquals(1500, manager.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(10, manager.payBonus(), 0.01);
    }
}
