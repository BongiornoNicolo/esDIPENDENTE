public abstract class Dipendente {
    protected String nome;
    protected double stipendioBase;

    //costruttore
    public Dipendente(String nome, double stipediobase){
        this.nome=nome;
        this.stipendioBase= stipediobase;
    }

    //nel metodo statico --> no public
    abstract double calcolaStipendio();


    public String descrizione(String nome){
        return "dipendente :" + nome;
    }

    @Override
    public String toString(){
        String des=descrizione(nome);
        double sti= calcolaStipendio();

        return des+" "+sti;
    }


}
