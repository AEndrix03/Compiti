package it.redegalli.compito4.main;

public class AutoMotore extends Veicolo {

    private String carburante;
    private double capacitàSerbatoio, litriRimanenti;
    private final int consumo = 20;

    @Override
    public String toString() {
        return "AutoMotore{" +
                "carburante='" + carburante + '\'' +
                ", capacitàSerbatoio=" + capacitàSerbatoio +
                ", litriRimanenti=" + litriRimanenti +
                ", consumo=" + consumo +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", colore='" + colore + '\'' +
                ", nPorte=" + nPorte +
                ", cavalli=" + cavalli +
                '}';
    }

    public String getCarburante() {
        return carburante;
    }

    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public double getCapacitàSerbatoio() {
        return capacitàSerbatoio;
    }

    public void setCapacitàSerbatoio(double capacitàSerbatoio) {
        this.capacitàSerbatoio = capacitàSerbatoio;
    }

    public double getLitriRimanenti() {
        return litriRimanenti;
    }

    public void setLitriRimanenti(double litriRimanenti) {
        this.litriRimanenti = litriRimanenti;
    }

    public int getConsumo() {
        return consumo;
    }

    public AutoMotore(String targa, String marca, String colore, int nPorte, int cavalli, String carburante, double capacitàSerbatoio, double litriRimanenti) {
        super(targa, marca, colore, nPorte, cavalli);
        this.carburante = carburante;
        this.capacitàSerbatoio = capacitàSerbatoio;
        this.litriRimanenti = litriRimanenti;
    }

    public void rifornimento(double litri) {
        litriRimanenti+=litri;
        if (litriRimanenti>capacitàSerbatoio)
            litriRimanenti=capacitàSerbatoio;
    }

    public double percorriKm(double litri) {
        return consumo*litri;
    }

}
