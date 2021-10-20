import java.util.Scanner;

public class MainTriangolo {

    public static void main(String[] args) {
        Triangolo t1 = new Triangolo(6.6,2.2,1.1);
        
        System.out.println(t1.toString());
        
        Triangolo t2 = new Triangolo();
        t2.setLatoA(10);
        t2.setLatoB(5);
        t2.setLatoC(5);
        
        System.out.println(t2.toString());
        
        Triangolo t3 = new Triangolo();
        
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci lato A: ");
        t3.setLatoA(scan.nextDouble());
        
        System.out.println("Inserisci lato B: ");
        t3.setLatoB(scan.nextDouble());
        
        System.out.println("Inserisci lato C: ");
        t3.setLatoC(scan.nextDouble());
        
        System.out.println(t3.toString());
        
        System.out.println(t1.isTriangoloEquilatero() ? "Il primo triangolo è equilatero" : "Il primo triangolo non è equilatero");
        System.out.println(t2.isTriangoloEquilatero() ? "Il secondo triangolo è equilatero" : "Il secondo triangolo non è equilatero");
        System.out.println(t3.isTriangoloEquilatero() ? "Il terzo triangolo è equilatero" : "Il terzo triangolo non è equilatero");
    }

}
