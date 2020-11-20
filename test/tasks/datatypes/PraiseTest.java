package tasks.datatypes;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PraiseTest {
    @Test
    public void checkPraise() {
        String rsl = "Сегодня я молодец!";
        assertThat(rsl, is("Сегодня я молодец!"));
    }
}