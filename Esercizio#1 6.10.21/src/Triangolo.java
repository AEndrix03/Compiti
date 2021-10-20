public class Triangolo {

    private double latoA,latoB,latoC;

    public Triangolo(double latoA, double latoB, double latoC) {
        this.latoA = latoA;
        this.latoB = latoB;
        this.latoC = latoC;
    }

    public Triangolo() {
        return;
    }

    public double getLatoA(){
        return latoA;
    }

    public double getLatoB(){
        return latoB;
    }

    public double getLatoC(){
        return latoC;
    }

    public void setLatoA(double latoA) {
        this.latoA = latoA;
    }

    public void setLatoB(double latoB) {
        this.latoB = latoB;
    }

    public void setLatoC(double latoC) {
        this.latoC = latoC;
    }

    public boolean isTriangoloEquilatero() {
        if (getLatoA()==getLatoB() && getLatoB()==getLatoC())
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Lato AB = "+getLatoA()+", Lato BC = "+getLatoB()+", Lato AC = "+getLatoC();
    }

}
