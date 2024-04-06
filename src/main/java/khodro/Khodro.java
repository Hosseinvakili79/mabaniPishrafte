package khodro;

public abstract class Khodro {
    protected boolean ayaRoshanAst;
    String mark;
    int gonjaesh;
    protected String noeDande;
     public void roshan() {
        ayaRoshanAst = true;
    }

    void khamosh() {
        ayaRoshanAst = false;
    }
    public abstract boolean ayaDarHalHarekatAst();
    public abstract String getMark();


}
