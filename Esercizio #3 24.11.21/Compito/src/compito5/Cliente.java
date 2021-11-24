package compito5;

import java.util.Arrays;

public class Cliente {

    private String nome, cognome, codFisc;
    private BankAccount[] conti;
    private SavingAccount[] titoliDepositi;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codFisc='" + codFisc + '\'' +
                ", conti=" + Arrays.toString(conti) +
                ", titoliDepositi=" + Arrays.toString(titoliDepositi) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public BankAccount[] getConti() {
        return conti;
    }

    public void setConti(BankAccount[] conti) {
        this.conti = conti;
    }

    public SavingAccount[] getTitoliDepositi() {
        return titoliDepositi;
    }

    public void setTitoliDepositi(SavingAccount[] titoliDepositi) {
        this.titoliDepositi = titoliDepositi;
    }

    public Cliente() {
    }

    public Cliente(String nome, String cognome, String codFisc, BankAccount[] conti, SavingAccount[] titoliDepositi) {
        this.nome = nome;
        this.cognome = cognome;
        this.codFisc = codFisc;
        this.conti = conti;
        this.titoliDepositi = titoliDepositi;
    }

    public void addConto(String iban, String nomeBanca) {
        BankAccount conto = new BankAccount(iban,nomeBanca,0);
        for (int i = 0; i<conti.length; i++)
            if (conti[i]==null) {
                conti[i] = conto;
                return;
            }
    }

    public boolean removeConto(String iban) {
        for (int i = 0; i<conti.length; i++)
            if (conti[i] != null && conti[i].getIban().equalsIgnoreCase(iban)) {
                conti[i] = null;
                return true;
            }
        return false;
    }

    public int searchConto(String iban) {
        for (int i = 0; i<conti.length; i++)
            if (conti[i] != null && conti[i].getIban().equalsIgnoreCase(iban))
                return i;
        return -1;
    }

    public void contiToString() {
        System.out.println("-----------------");
        for (int i = 0; i<conti.length; i++)
            if (conti[i]!=null)
                System.out.println(conti[i].toString());
        System.out.println("-----------------");
    }

    public void depositiToString() {
        System.out.println("-----------------");
        for (int i = 0; i<titoliDepositi.length; i++)
            if (titoliDepositi[i]!=null)
                System.out.println(titoliDepositi[i].toString());
        System.out.println("-----------------");
    }

}
