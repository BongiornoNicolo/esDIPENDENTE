public class Stagista extends Impiegato{

    public Stagista(String nome, double stipediobase) {
        super(nome, stipediobase);
    }

    //stipendio 50% dell'impiegato
    @Override
    double calcolaStipendio() {
        double val = calcolaStipendio() /2;
        return calcolaStipendio();
    }

    @Override
    public String toString(){
        return super.toString();
    }


}
