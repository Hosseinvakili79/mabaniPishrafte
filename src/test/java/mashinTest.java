import static java.lang.System.out;

public class mashinTest {
    class mashin {
        //dade
        boolean ayaMashinRoshanAst;
        boolean ayaDarBazast;
        String mark;
        String color;
        double toul;
        double arz;


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
        void harkat(){
            if(!ayaDarBazast&&ayaMashinRoshanAst){
                out.println("mashin dar hal harkat ast");
            }else {
                out.println("mashin park ast");
            }
        }



    }

}
