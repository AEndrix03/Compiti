package compito5;

public class SavingAccount {

    private String iban, nomeBanca;
    private double interestRate, saldo;

    public SavingAccount(String iban, String nomeBanca, double interestRate, double saldo) {
        this.iban = iban;
        this.nomeBanca = nomeBanca;
        this.interestRate = interestRate;
        this.saldo = saldo;
    }

    public SavingAccount() {

    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "iban='" + iban + '\'' +
                ", nomeBanca='" + nomeBanca + '\'' +
                ", interestRate=" + interestRate +
                ", saldo=" + saldo +
                '}';
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addInteressi(double interesse) {
        interestRate*=100;
        interestRate+=interesse;
        if (interestRate>100)
            interestRate = 100;
        interestRate/=100;
    }

    //Deposita sempre. Aggiungi 'soldi' soldi a 'saldo'
    public void deposita(double soldi) {
        saldo += (soldi - (soldi*interestRate));
    }

    //Preleva solo se il conto possiede abbastanza soldi
    public boolean preleva(double soldi) {
        if (saldo<(soldi + (soldi*interestRate)))
            return false;
        saldo -= (soldi + (soldi*interestRate));
        return true;
    }
}
