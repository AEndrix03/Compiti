package it.redegalli.compito4.main;

public class AutoElettrica extends Veicolo{

    private double caricaRimanente;
    private double caricaMassima;
    private String marcaBatteria;
    private final int consumo = 20;

    public AutoElettrica(String targa, String marca, String colore, int nPorte, int cavalli, double caricaRimanente, double caricaMassima, String marcaBatteria) {
        super(targa, marca, colore, nPorte, cavalli);
        this.caricaRimanente = caricaRimanente;
        this.caricaMassima = caricaMassima;
        this.marcaBatteria = marcaBatteria;
    }

    public double getCaricaMassima() {
        return caricaMassima;
    }

    public void setCaricaMassima(double caricaMassima) {
        this.caricaMassima = caricaMassima;
    }

    public double getCaricaRimanente() {
        return caricaRimanente;
    }

    public void setCaricaRimanente(double caricaRimanente) {
        this.caricaRimanente = caricaRimanente;
    }

    public String getMarcaBatteria() {
        return marcaBatteria;
    }

    public void setMarcaBatteria(String marcaBatteria) {
        this.marcaBatteria = marcaBatteria;
    }

    public int getConsumo() {
        return consumo;
    }

    public void carica(double energia) {
        caricaRimanente+=energia;
        if (caricaRimanente>caricaMassima)
            caricaRimanente=caricaMassima;
    }

    public double percorriKm(double energia) {
        return consumo*energia;
    }
}
