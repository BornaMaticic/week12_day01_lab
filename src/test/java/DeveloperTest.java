import techstaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dave", 2, 1000);
    }

    @Test
    public void getName() {
        assertEquals("Dave", developer.getName());
    }

    @Test
    public void setName() {
        developer.setName("Scott");
        assertEquals("Scott", developer.getName());
    }

    @Test
    public void getNI() {
        assertEquals(2, developer.getNI());
    }

    @Test
    public void setNI() {
        developer.setNI(5);
        assertEquals(5, developer.getNI());
    }

    @Test
    public void getSalary() {
        assertEquals(1000, developer.getSalary(), 0.01);
    }

    @Test
    public void setSalary() {
        developer.setSalary(5000);
        assertEquals(5000, developer.getSalary(), 0.01);
    }


    @Test
    public void raiseSalary() {
        developer.raiseSalary(1.5);
        assertEquals(1500, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(10, developer.payBonus(), 0.01);
    }
}

