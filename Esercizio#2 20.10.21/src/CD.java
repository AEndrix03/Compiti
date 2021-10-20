public class CD {

    private String titolo;
    private Autore autore;
    private int numeroBrani;
    private double durata;

    public CD(String titolo, Autore autore, int numeroBrani, double durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = numeroBrani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return titolo;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public double getDurata() {
        return durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Il titolo del CD è "+titolo+", scritto da "+autore+", composto da "+numeroBrani+" brani e " +
                "con una durata pari a "+durata+" secondi";
    }

    public CD compareDurata(CD cd) {
        if (this.durata > cd.durata)
            return this;
        else return cd;
    }

}
