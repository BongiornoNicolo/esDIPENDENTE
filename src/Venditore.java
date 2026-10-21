public class Venditore extends Dipendente {
    private double vendite;
    private double percentualeCommissione;

    // Costruttore
    public Venditore(String nome, double stipendioBase, double vendite, double percentualeCommissione) {
        super(nome, stipendioBase);
        this.vendite = vendite;
        this.percentualeCommissione = percentualeCommissione;
    }


    @Override
    public double calcolaStipendio() {
        return stipendioBase + (vendite * percentualeCommissione / 100);
    }

    @Override
    public String toString() {
        return "venditore: " + super.toString();
    }
}