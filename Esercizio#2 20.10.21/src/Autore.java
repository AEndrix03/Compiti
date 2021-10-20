public class Autore {

    private String nome;
    private int numeroCD;

    public Autore() {

    }

    public Autore(String nome, int numeroCD) {
        this.nome = nome;
        this.numeroCD = numeroCD;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCD() {
        return numeroCD;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumeroCD(int numeroCD) {
        this.numeroCD = numeroCD;
    }

    @Override
    public String toString() {
        return "L'autore "+nome+" possiede "+numeroCD+" CD.";
    }

}
