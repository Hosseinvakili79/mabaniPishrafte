import khodro.mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class mashinTest {
    @Test
    void Mashin_bayad_harekat_konad_vaghty_dar_mashin_baste_va_roshan_ast() {
        //Given
        mashin benz = new mashin("Benz");
        mashin volvo = new mashin("Volvo");

        //when
        boolean ayaDarHalHarkatAst = benz.ayaDarHalHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarkatMikonad = volvo.ayaDarHalHarekatAst();

        //then
        assertFalse(ayaDarHalHarkatAst);
        assertTrue(ayaVolvoHarkatMikonad);


    }


}


