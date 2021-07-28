package esercizio2;

import esercizio2.Libro;
import esercizio2.Pagina;
import esercizio2.Sezione;

public class Start {

	public static void main(String[] args) {
        Libro atlantide = new Libro();
        atlantide.setTitolo("Atlantide");
        atlantide.setPrezzo(19.90);
//        atlantide.addAutori("Clive Cussler");

//        Pagina p1 = new Pagina();
//        p1.setContainer("Immagine, Titolo: Atlantide. Autore: Clive Cussler");
//        atlantide.addComponent(p1);
//
//        Sezione s1 = new Sezione();
//        s1.setTitolo("Introduzione al testo");
//        atlantide.addComponent(s1);
//
//        Pagina p2 = new Pagina();
//        p2.setContainer("Inizio testo");
//        s1.addComponent(p2);
//
//        Pagina p3 = new Pagina();
//        p3.setContainer("Continuo del testo...");
//        s1.addComponent(p3);
//
//        Pagina p4 = new Pagina();
//        p4.setContainer("Continuo del testo");
//        s1.addComponent(p4);
//
//        Sezione s2 = new Sezione();
//        s2.setTitolo("In volo");
//        atlantide.addComponent(s2);
//
//        Sezione s2_1 = new Sezione();
//        s2_1.setTitolo("Sorvolo dell oceano");
//        s2.addComponent(s2_1);
//
//        Sezione s3 = new Sezione();
//        s3.setTitolo("Atterraggio di fortuna");
//        atlantide.addComponent(s3);
//
//        Sezione s4 = new Sezione();
//        s4.setTitolo("L isola misteriosa");
//        atlantide.addComponent(s4);
//
//        Sezione s4_1 = new Sezione();
//        s4_1.setTitolo("L oggetto misterioso");
//        s4.addComponent(s4_1);
//
//        Sezione s5 = new Sezione();
//        s5.setTitolo("Il segreto di atlantide");
//        atlantide.addComponent(s5);

        atlantide.stampa();

    }

}