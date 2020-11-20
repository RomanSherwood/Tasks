package tasks.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrintTest {
    @Test
    public void test() {
        String rsl = "Сегодня я молодец!";
        assertThat(rsl, is("Сегодня я молодец!"));
    }
}