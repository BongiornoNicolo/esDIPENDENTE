import java.util.ArrayList;

public class Azienda {
    //array list con i dipendenti
    private ArrayList<Dipendente> dipendenti;

    /*
    lista.add(elemento); // Aggiunge un elemento in coda alla lista

    lista.add(indice, elemento); // Inserisce un elemento nella posizione specificata

    lista.get(indice); // Restituisce l'elemento alla posizione indicata

    lista.set(indice, nuovoElemento); // Sostituisce l'elemento alla posizione indicata con uno nuovo

    lista.remove(indice); // Rimuove l'elemento presente alla posizione indicata

    lista.remove(elemento); // Rimuove la prima occorrenza dell'elemento specificato

    lista.clear(); // Rimuove tutti gli elementi svuotando l'ArrayList

    lista.size(); // Restituisce il numero totale di elementi presenti nella lista

    lista.isEmpty(); // Restituisce true se l'ArrayList è vuoto, altrimenti false

    lista.contains(elemento); // Restituisce true se l'elemento è presente nella lista

    lista.indexOf(elemento); // Restituisce la posizione della prima occorrenza dell'elemento (-1 se non presente)

    lista.lastIndexOf(elemento); // Restituisce la posizione dell'ultima occorrenza dell'elemento (-1 se non presente)

    lista.toArray(); // Converte l'ArrayList in un classico array di oggetti
     */

    //costruttore
    public Azienda(){
        dipendenti = new ArrayList<>();
    }

    //METODO AGGIUNGI
    public void aggiungi(Dipendente d){
        //.add per aggiungere un dipendente
        dipendenti.add(d);
    }

    //METODO TOTALE STIPENDI
    public double costoTotale(){
        double tot=0;

        //foreach per scorrere l'array list
        //for(var singola : collezione totale){}
        for(Dipendente d : dipendenti){
            tot += d.calcolaStipendio();    //richiamo il metodo
        }

        return tot;
    }

    //METODO STAMPATUTTI
    public void stampaTutti(){
        for(Dipendente d : dipendenti){
            System.out.println(d);  //stampo ogni volta che faccio il ciclio la var
        }
    }

    //METODO PIUPAGATO
    public Dipendente piuPagato(){
        Dipendente corrente=null;
        //Dipendente max=null;
        Dipendente max=dipendenti.get(0); //primo valore dell'array diventa max

        for(int i=0; i< dipendenti.size();i++){
            corrente= dipendenti.get(i);    //corrente cambia valore ogni volta che entro nel ciclo
            //se corrente è maggiore di max allora di scambio e poi finito tutto l'array faccio il return di max
            if (corrente.calcolaStipendio() > max.calcolaStipendio()) {
                max = corrente;
            }
        }
        return max;
    }

}
