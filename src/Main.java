import java.awt.*;

void main() {
    ///
    Azienda miaAzienda = new Azienda();

    // creo gli oggetti dipendenti e poi uso i metodi dentro Azienda.java per inserirli
    Dipendente impiegato = new Impiegato("Mario Rossi", 1500.0);
    Dipendente manager = new Manager("Luigi Verdi", 2500.0, 600.0);
    Dipendente venditore = new Venditore("Anna Neri", 1200.0, 10000.0, 5.0); // 5% di commissione sulle vendite
    Dipendente stagista = new Stagista("Giovanni Gialli", 1400.0); // Il suo stipendio sarà dimezzato dalla classe Stagista

    //METODO AGGIUNGI
    miaAzienda.aggiungi(impiegato);
    miaAzienda.aggiungi(manager);
    miaAzienda.aggiungi(venditore);
    miaAzienda.aggiungi(stagista);

    //METODO STAMPA
    System.out.println("DIPENDENTI:");
    miaAzienda.stampaTutti();

    //METODO TOTALE STIPENMDI
    System.out.println("tot stipendi: " + miaAzienda.costoTotale());

    //METODO PIU PAGATO
    //DA CHIEDERE IL CLASSE COME FUNZIONA BENE PERCHE \
    //QUEST'ULTIMO LO HA FATTO GEMINI IL MAIN MA NON LO HO CAPITO
    Dipendente piup = miaAzienda.piuPagato();
    System.out.println(piup);
}
