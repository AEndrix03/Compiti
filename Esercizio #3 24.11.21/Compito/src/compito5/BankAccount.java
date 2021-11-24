package compito5;

public class BankAccount {

    private String iban, nomeBanca;
    private double saldo;

    @Override
    public String toString() {
        return "BankAccount{" +
                "iban='" + iban + '\'' +
                ", nomeBanca='" + nomeBanca + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public BankAccount() {

    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNomeBanca() {
        return nomeBanca;
    }

    public void setNomeBanca(String nomeBanca) {
        this.nomeBanca = nomeBanca;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public BankAccount(String iban, String nomeBanca, double saldo) {
        this.iban = iban;
        this.nomeBanca = nomeBanca;
        this.saldo = saldo;
    }

    //Deposita sempre. Aggiungi 'soldi' soldi a 'saldo'
    public void deposita(double soldi) {
        saldo += soldi;
    }

    //Preleva solo se il conto possiede abbastanza soldi
    public boolean preleva(double soldi) {
        if (saldo<soldi)
            return false;
        saldo -= soldi;
        return true;
    }

}
