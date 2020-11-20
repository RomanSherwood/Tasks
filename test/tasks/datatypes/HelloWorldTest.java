package tasks.datatypes;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {
    @Test
    public void checkOutHelloJob4j() {
        String rsl = "Hello, Job4j!";
        assertThat(rsl, is("Hello, Job4j!"));
    }

}