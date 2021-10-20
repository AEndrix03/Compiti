import java.lang.System;

public class Main {

    public static void main(String[] args) {
        Autore a1 = new Autore("Andrea Redegalli", 10);
        Autore a2 = new Autore("Marco Rossi", 10);
        Autore a3 = new Autore("Andrea Braia", 10);
        Autore a4 = new Autore("Edoardo Mari", 10);

        CD cd1 = new CD("No", a1, 6, 40.2);
        CD cd2 = new CD("Si2", a2, 5, 30.6);
        CD cd3 = new CD("trenta", a1, 15, 72.2);
        CD cd4 = new CD("No1", a1, 11, 43.1);
        CD cd5 = new CD("No5", a3, 18, 66.2);
        CD cd6 = new CD("regeg", a3, 2, 11.8);
        CD cd7 = new CD("yyyyyy", a4 , 5, 35.3);
        CD cd8 = new CD("No11", a1, 3, 13.2);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());

        System.out.println("");

        System.out.println(cd1.toString());
        System.out.println(cd2.toString());
        System.out.println(cd3.toString());
        System.out.println(cd4.toString());
        System.out.println(cd5.toString());
        System.out.println(cd6.toString());
        System.out.println(cd7.toString());
        System.out.println(cd8.toString());

        System.out.println("Fra il cd "+cd1.getTitolo()+" e "+cd2.getTitolo()+", "+cd1.compareDurata(cd2).getTitolo()+" risulta essere quello più lungo");

    }


}
