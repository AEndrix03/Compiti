package it.redegalli.compito4.main;

public class Veicolo {

    protected String targa, marca, colore;
    protected int nPorte, cavalli;

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", colore='" + colore + '\'' +
                ", nPorte=" + nPorte +
                ", cavalli=" + cavalli +
                '}';
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColore() {
        return colore;
    }

    public int getnPorte() {
        return nPorte;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public Veicolo(String targa, String marca, String colore, int nPorte, int cavalli) {
        this.targa = targa;
        this.marca = marca;
        this.colore = colore;
        this.nPorte = nPorte;
        this.cavalli = cavalli;
    }
}
