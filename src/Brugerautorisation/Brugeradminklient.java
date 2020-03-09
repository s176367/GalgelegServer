package Brugerautorisation;

import Brugerautorisation.Data.Bruger;
import Brugerautorisation.Data.Diverse;

import java.rmi.Naming;

public class Brugeradminklient {

    public static void main(String[] arg) throws Exception {
	    //Brugeradmin ba =(Brugeradmin) Naming.lookup("rmi://localhost/brugeradmin");
        Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");

        Bruger off = ba.hentBrugerOffentligt("s176367");
        System.out.println("Fik offentlige data " + Diverse.toString(off));

        //ba.sendGlemtAdgangskodeEmail("s176367", "Dette er en test, husk at skifte kode");
        //ba.ændrAdgangskode("s176367", "kode1hpaag", "Geertsen1");
        Bruger b = ba.hentBruger("s176367", "Mmkkh3400");
        System.out.println("Fik bruger " + b);
        System.out.println("med data " + Diverse.toString(b));
        // ba.sendEmail("jacno", "xxx", "Hurra det virker!", "Jeg er så glad");

        Object ekstraFelt = ba.getEkstraFelt("s176367", "Mmkkh3400", "hobby");
        System.out.println("Brugerens hobby er: " + ekstraFelt);

        ba.setEkstraFelt("s176367", "Mmkkh3400", "hobby", "Aktier og Wow"); // Skriv noget andet her

        String webside = (String) ba.getEkstraFelt("s176367", "Mmkkh3400", "webside");
        System.out.println("Brugerens webside er: " + webside);

    }
}
