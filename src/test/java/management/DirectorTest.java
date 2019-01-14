package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jeff", 6, 4500, "HR", 10000);
    }


    @Test
    public void getBudget() {
        assertEquals(10000, director.getBudget(), 0.01);
    }

    @Test
    public void setBudget() {
        director.setBudget(20000);
        assertEquals(20000, director.getBudget(), 0.01);
    }
}
