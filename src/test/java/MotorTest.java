import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {
    @Test
    void Motor_bayad_harekat_konad_vaghty_roshan_ast() {
        Motor motor = new Motor();
        motor.roshan();
        boolean ayaDarHalHarkatAst = motor.ayaDarHalHarekatAst();
        Assertions.assertTrue(ayaDarHalHarkatAst);
    }
}
