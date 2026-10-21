public class Manager extends Dipendente{
    public double bonus;

    public Manager(String nome, double stipediobase, double bonus) {
        super(nome, stipediobase);
        this.bonus=bonus;
    }

    //facendo l'override poi nel metodo sotto uso questo valore
    @Override
    double calcolaStipendio() {
        return calcolaStipendio()+ bonus;
    }

    @Override
    public String toString(){
        return  "(manager)" + super.toString();
    }
    //dipendente nome manager stipendio


}
