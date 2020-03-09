import Brugerautorisation.Brugeradmin;
import Galgelogik.Galgelogik;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");

        Scanner scan = new Scanner(System.in);
        System.out.println("indtast brugernavn");
        String brugernavn = scan.next();
        System.out.println("indtast password");
        String adgangskode = scan.next();

        try{
            ba.hentBruger(brugernavn,adgangskode);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
