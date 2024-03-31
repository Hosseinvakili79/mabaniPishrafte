import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class mashinTest {
    @Test
    void Mashin_bayad_harekat_konad_vaghty_dar_mashin_baste_va_roshan_ast() {
        //Given
        mashin benz = new mashin("Benz");
        mashin volvo = new mashin("Volvo");

        //when
        boolean ayaDarHalHarkatAst = benz.ayaMashinDarHalHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarkatMikonad = volvo.ayaMashinDarHalHarekatAst();

        //then
        assertFalse(ayaDarHalHarkatAst);
        assertTrue(ayaVolvoHarkatMikonad);

//        mashin mashin = new mashin();
//        mashin.darBazAst();
//        mashin.darbasteAst();
//        out.println("aya dar mashin baz ast?"+ mashin.ayaDarBazast);
//        mashin.harkat();
//        out.println("------------------------------------------");
//
//        mashin pride = new mashin("pride");
//        pride.darBazAst();
//        pride.roshan();
//        pride.harkat();

    }

    class mashin {
        //constructor
        mashin() {
            out.println("yak mashin bdon dade sakhte shod");
        }

        mashin(String mark) {
            this.mark = mark;
            out.println("yek mashin " + mark + " sakhte shod");
        }

        //dade
        boolean ayaMashinRoshanAst;//false
        boolean ayaDarBazast;//false
        String mark;


        //method
        void roshan() {
            out.println("mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamosh() {
            out.println("mashin khamosh ast");
            ayaMashinRoshanAst = false;
        }

        void darBazAst() {
            out.println("dar mashin baz ast");
            ayaDarBazast = true;
        }

        void darbasteAst() {
            out.println("dar mashin baste ast");
            ayaDarBazast = false;
        }

        boolean ayaMashinDarHalHarekatAst() {
            if (!ayaDarBazast && ayaMashinRoshanAst) {
                out.println("mashin dar hal harkat ast");
                return true;
            } else {
                out.println("mashin park ast");
                return false;
            }
        }


    }

}
