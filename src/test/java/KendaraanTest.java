import static org.junit.Assert.*;
import org.junit.Test;

public class KendaraanTest {

    @Test
    public void testHandoBaet() {
        handoBaet motor = new handoBaet("Merah");

        assertFalse("Awalnya sepeda motor tidak boleh jalan", motor.jalan());

        motor.isiTangkiFull();
        assertTrue("Sepeda motor harusnya bisa jalan setelah isi tangki", motor.jalan());
    }

    @Test
    public void testYamahaMoi() {
        yamahaMoi motor = new yamahaMoi("Biru");

        assertFalse("Awalnya sepeda motor tidak boleh jalan", motor.jalan());

        motor.isiTangkiFull();
        assertTrue("Sepeda motor harusnya bisa jalan setelah isi tangki", motor.jalan());
    }
}
