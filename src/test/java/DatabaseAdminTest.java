import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Dave", 2, 1000);
    }

    @Test
    public void getName() {
        assertEquals("Dave", databaseAdmin.getName());
    }

    @Test
    public void setName() {
        databaseAdmin.setName("Scott");
        assertEquals("Scott", databaseAdmin.getName());
    }

    @Test
    public void getNI() {
        assertEquals(2, databaseAdmin.getNI());
    }

    @Test
    public void setNI() {
        databaseAdmin.setNI(5);
        assertEquals(5, databaseAdmin.getNI());
    }

    @Test
    public void getSalary() {
        assertEquals(1000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void setSalary() {
        databaseAdmin.setSalary(5000);
        assertEquals(5000, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(1.5);
        assertEquals(1500, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(10, databaseAdmin.payBonus(), 0.01);
    }
}

