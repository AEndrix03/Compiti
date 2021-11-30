package it.redegalli.compito4.main;

public class Concessionaria {

    private String nome;
    private AutoMotore[] autoM;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AutoMotore[] getAutoM() {
        return autoM;
    }

    public void setAutoM(AutoMotore[] autoM) {
        this.autoM = autoM;
    }

    public AutoElettrica[] getAutoE() {
        return AutoE;
    }

    public void setAutoE(AutoElettrica[] autoE) {
        AutoE = autoE;
    }

    public int getnAutoM() {
        return nAutoM;
    }

    public void setnAutoM(int nAutoM) {
        this.nAutoM = nAutoM;
    }

    public int getnAutoE() {
        return nAutoE;
    }

    public void setnAutoE(int nAutoE) {
        this.nAutoE = nAutoE;
    }

    private AutoElettrica[] AutoE;
    private int nAutoM, nAutoE;
}
