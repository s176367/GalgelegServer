package Galgelogik;


import Galgelogik.GalgelogikI;

import java.rmi.Naming;

public class GalgeServer {

    public static void main (String[] arg) throws Exception {
        java.rmi.registry.LocateRegistry.createRegistry(1099);

        GalgelogikI logik = new Galgelogik();
        Naming.rebind("rmi://localhost:1099/galgelogik", logik);

        System.out.println("Forbindelse til GalgeLeg server er oprettet");

    }
}
